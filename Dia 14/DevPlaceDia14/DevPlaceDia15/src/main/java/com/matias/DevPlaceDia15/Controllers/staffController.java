package com.matias.DevPlaceDia15.Controllers;

import com.matias.DevPlaceDia15.Domain.Staffs;
import com.matias.DevPlaceDia15.Repositories.StaffsRepo;

import com.matias.DevPlaceDia15.Exception.ResourceNotFoundException;
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
@RequestMapping("/apitems/staffs")
public class staffController {
    @Autowired
    private StaffsRepo staffsRepo;

    @GetMapping
    public List<Staffs> getAllStaffs() {
        return this.staffsRepo.findAll();
    }

    @GetMapping("/{id}")
    public Staffs getStaffById(@PathVariable (value = "id") long staffId) {
        return this.staffsRepo.findById(staffId)
                .orElseThrow(() -> new ResourceNotFoundException("Staff item not found with id :" + staffId));
    }

    @PostMapping
    public Staffs creatStaff(@RequestBody Staffs staff) {
        return this.staffsRepo.save(staff);
    }

    @PutMapping("/{id}")
    public Staffs updateWeapon(@RequestBody Staffs staff, @PathVariable ("id") long staffId) {
        Staffs addStaff = this.staffsRepo.findById(staffId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found" + staffId));
        addStaff.setName(staff.getName());
        addStaff.setAttribute(staff.getAttribute());
        addStaff.setDescription(staff.getDescription());
        addStaff.setStats(staff.getStats());
        return this.staffsRepo.save(addStaff);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Staffs> deteleWeapon(@PathVariable ("id") long staffId){
        Staffs existingWeapon = this.staffsRepo.findById(staffId)
                .orElseThrow(() -> new ResourceNotFoundException("Error id not Found:" + staffId));
        this.staffsRepo.delete(existingWeapon);
        return ResponseEntity.ok().build();
    }
}