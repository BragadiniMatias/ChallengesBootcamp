package com.dia19.devplacedia19.controller;

import com.dia19.devplacedia19.model.FileInfo;
import com.dia19.devplacedia19.services.FileStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/uploads")
public class FileController {
    @Autowired
    FileStorageServiceImpl fs;

    @GetMapping("/store")
    public String index(){
        return "uploads";
    }

    @PostMapping("/store")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttrs) {
        String message = "";
        try {
            fs.save(file);
            message = "Archivo añadido " + file.getOriginalFilename();
            redirectAttrs
                    .addFlashAttribute("mensaje", message)
                    .addFlashAttribute("clase", "success");
            return "redirect:/uploads";
        } catch (Exception e) {
            message = "Error al cargar el archivo: " + file.getOriginalFilename() + "!";
            redirectAttrs
                    .addFlashAttribute("mensaje", message)
                    .addFlashAttribute("clase", "success");
            return "redirect:/uploads/store";
        }
    }
    @GetMapping("/list")
    public String getListFiles(Model model) {
        List<FileInfo> fileInfos = fs.loadAll().map(path -> {
            String filename = path.getFileName().toString();
            String url = MvcUriComponentsBuilder
                    .fromMethodName(FileController.class, "getFile", path.getFileName().toString()).build().toString();
            return new FileInfo(filename, url);
        }).collect(Collectors.toList());
        model.addAttribute("listfiles", fileInfos);
        return "list_files";
    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
        Resource file = fs.load(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }
}

