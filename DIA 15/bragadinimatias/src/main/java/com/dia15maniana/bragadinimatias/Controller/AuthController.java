package com.dia15maniana.bragadinimatias.Controller;

import com.dia15maniana.bragadinimatias.Models.User;
import com.dia15maniana.bragadinimatias.Repository.UserRepository;
import com.dia15maniana.bragadinimatias.Request.LoginRequest;
import com.dia15maniana.bragadinimatias.message.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/login")
    public ResponseEntity<?> auth(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.badRequest().body(new MessageResponse("Error: El DNI existe"));

    }

    @PostMapping("/register")
    public  ResponseEntity<?> register(@Valid @RequestBody User user){
        if( userRepository.existsByEmail(user.getEmail()) )  {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El email existe"));
        }
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("Usuario Registrado Correctamente"));
    }

}
