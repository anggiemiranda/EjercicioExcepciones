package com.example.EjercicioExcepciones.controllers;

import com.example.EjercicioExcepciones.dtos.responses.UserResponseDTO;
import com.example.EjercicioExcepciones.mappers.UserMapper;
import com.example.EjercicioExcepciones.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody UserResponseDTO userResponse) {
        return null;
    }
}
