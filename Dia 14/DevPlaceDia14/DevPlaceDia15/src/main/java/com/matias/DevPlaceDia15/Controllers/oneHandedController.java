package com.matias.DevPlaceDia15.Controllers;

import java.util.List;

import com.matias.DevPlaceDia15.Exception.ResourceNotFoundException;
import com.matias.DevPlaceDia15.Domain.oneHanded;
import com.matias.DevPlaceDia15.Repositories.oneHandedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/apitems/oneHanded")
public class oneHandedController {
    @Autowired
    private oneHandedRepo oneHandedRepo;

    @GetMapping
    public List<oneHanded> getAllOneHanded() {
        return this.oneHandedRepo.findAll();
    }

    @GetMapping("/{id}")
    public oneHanded getOneHandedById(@PathVariable (value = "id") long oneHandId) {
        return this.oneHandedRepo.findById(oneHandId)
                .orElseThrow(() -> new ResourceNotFoundException("One handed item not found with id :" + oneHandId));
    }

    @PostMapping
    public oneHanded creatOneHWeapon(@RequestBody oneHanded oneH) {
        return this.oneHandedRepo.save(oneH);
    }

    @PutMapping("/{id}")
    public oneHanded updateWeapon(@RequestBody oneHanded oneH, @PathVariable ("id") long oneHId) {
        oneHanded addoneH = this.oneHandedRepo.findById(oneHId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + oneHId));
        addoneH.setName(oneH.getName());
        addoneH.setAttribute(oneH.getAttribute());
        addoneH.setDescription(oneH.getDescription());
        addoneH.setStats(oneH.getStats());
        return this.oneHandedRepo.save(addoneH);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<oneHanded> deteleWeapon(@PathVariable ("id") long oneHId){
        oneHanded existingWeapon = this.oneHandedRepo.findById(oneHId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + oneHId));
        this.oneHandedRepo.delete(existingWeapon);
        return ResponseEntity.ok().build();
    }
}
