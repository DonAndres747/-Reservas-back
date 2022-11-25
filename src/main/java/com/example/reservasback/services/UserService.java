package com.example.reservasback.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservasback.models.UserModel;
import com.example.reservasback.repositories.UserRepository;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtenerUsuarios(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel crearUsuario(UserModel usuario){
        return userRepository.save(usuario);
    }

    public Optional<UserModel> obtenerPorId(Long userId){
        return userRepository.findById(userId);
    }

    public boolean eliminarUsuario(Long userId){
        try {
            userRepository.deleteById(userId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
