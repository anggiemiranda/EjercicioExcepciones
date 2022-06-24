package com.example.EjercicioExcepciones.services;

import com.example.EjercicioExcepciones.dtos.responses.UserResponseDTO;
import com.example.EjercicioExcepciones.models.UserModel;
import com.example.EjercicioExcepciones.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO createUser(UserModel user) {
        return null;
    }
}
