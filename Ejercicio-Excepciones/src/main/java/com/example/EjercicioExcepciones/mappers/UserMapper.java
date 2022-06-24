package com.example.EjercicioExcepciones.mappers;

import com.example.EjercicioExcepciones.dtos.responses.UserResponseDTO;
import com.example.EjercicioExcepciones.entities.UserEntity;
import com.example.EjercicioExcepciones.models.UserModel;

public class UserMapper {
    public static UserModel dtoToUserModel (UserResponseDTO user) {
        return new UserModel(user.getEmail(), user.getPassword());
    }

    public static UserModel entityToUserModel (UserEntity user) {
        return new UserModel(user.getEmail(), user.getPassword());
    }

    public static UserResponseDTO modelToUserDto (UserModel user) {
        return new UserResponseDTO(user.getEmail(), user.getPassword());
    }

    public static UserEntity modelToUserEntity (UserModel user) {
        return new UserEntity(user.getEmail(),user.getPassword());
    }
}
