package com.matias.DevPlaceDia15.Controllers;

import com.matias.DevPlaceDia15.Domain.twoHanded;
import com.matias.DevPlaceDia15.Exception.ResourceNotFoundException;
import com.matias.DevPlaceDia15.Repositories.twoHandedRepo;
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

import java.util.List;


@RestController
@RequestMapping("/apitems/twohand")
public class twoHandedController {

    @Autowired
    private twoHandedRepo twoHandedRepo;

    @GetMapping
    public List<twoHanded> getAllTwoHanded() {
        return this.twoHandedRepo.findAll();
    }

    @GetMapping("/{id}")
    public twoHanded getTwoHandedById(@PathVariable (value = "id") long twoHId) {
        return this.twoHandedRepo.findById(twoHId)
                .orElseThrow(() -> new ResourceNotFoundException("Two handed item not found with id :" + twoHId));
    }

    @PostMapping
    public twoHanded createTwoHanded(@RequestBody twoHanded twoH) {
        return this.twoHandedRepo.save(twoH);
    }

    @PutMapping("/{id}")
    public twoHanded updateWeapon(@RequestBody twoHanded twoH, @PathVariable ("id") long twoHId) {
        twoHanded addTwoHanded = this.twoHandedRepo.findById(twoHId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + twoHId));
        addTwoHanded.setName(twoH.getName());
        addTwoHanded.setAttribute(twoH.getAttribute());
        addTwoHanded.setDescription(twoH.getDescription());
        addTwoHanded.setStats(twoH.getStats());
        return this.twoHandedRepo.save(addTwoHanded);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<twoHanded> deteleWeapon(@PathVariable ("id") long twoHId){
        twoHanded existingWeapon = this.twoHandedRepo.findById(twoHId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + twoHId));
        this.twoHandedRepo.delete(existingWeapon);
        return ResponseEntity.ok().build();
    }
}