package com.matias.bragadini.thymeleaf.controllers;


import com.matias.bragadini.thymeleaf.Services.StudentServices;
import com.matias.bragadini.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServices us;

    @GetMapping
    public String getAllStudents(Model model){
        model.addAttribute("student", us.getAllStudents());
        return "students";
    }

    @GetMapping("/create")
    public String formularioStudent(Model model){
        Student st = new Student();
        model.addAttribute("student", st);
        return "createStudent";
    }

    @PostMapping("/create")
    public String saveStudentDB(@ModelAttribute("student") Student st){
        us.saveStudent(st);
        return "redirect:/students";
    }

    @GetMapping("/update/{dni}")
    public String updateStudent(@PathVariable("dni") long dni, Model model){
        Student stu = us.getStudent(dni);
        model.addAttribute("student", stu);
        return "update_student";
    }

    @PostMapping("/update/{dni}")
    public String updateSttudent(@ModelAttribute("user") Student stu){
        us.saveStudent(stu);
        return "redirect:/students";
    }





}
