package com.dia15maniana.bragadinimatias.Controller;

import com.dia15maniana.bragadinimatias.Models.User;
import com.dia15maniana.bragadinimatias.Repository.UserRepository;
import com.dia15maniana.bragadinimatias.message.MessageResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.Valid;
import java.util.List;

public class ClientController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @ApiOperation(value = "Listar usuario", notes="..")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok, Listado de usuarios", response= User.class),
            @ApiResponse(code = 500, message = "Error Server"),
            @ApiResponse(code = 400, message = "no encotro datos")
    })
    @GetMapping
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
        if( userRepository.existsByEmail(user.getEmail()) )  {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El email existe"));
        }
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("Usuario Registrado Correctamente"));
    }

}
