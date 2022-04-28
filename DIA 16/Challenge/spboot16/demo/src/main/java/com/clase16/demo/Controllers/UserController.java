package com.clase16.demo.Controllers;

import com.clase16.demo.models.UserModel;
import com.clase16.demo.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserRepository ur;

    @Autowired
    private PasswordEncoder pswE;

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers(){
        List<UserModel> allUsers = ur.findAll();
        return ResponseEntity.status(200).body(null);
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UserModel user){
        if(user.getUsername().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()){
            return ResponseEntity.status(400).body("Incomplete data");
        }
        user.setPassword(pswE.encode(user.getPassword()));
        ur.save(user);
        return ResponseEntity.status(200).body("Ok");
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable("id") int id){
        if(!ur.existsById(id)) return ResponseEntity.status(400).body(null);
        UserModel user = ur.findById(id).get();
        return ResponseEntity.status(200).body(user);
    }

}
