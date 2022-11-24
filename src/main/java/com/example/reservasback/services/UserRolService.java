package com.example.reservasback.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservasback.models.UserRolModel;
import com.example.reservasback.repositories.UserRolRepository;

@Service
public class UserRolService {
    @Autowired
    UserRolRepository userRolRepository;

    public ArrayList<UserRolModel> obtenerUsuarios(){
        return (ArrayList<UserRolModel>) userRolRepository.findAll();
    }

    public UserRolModel crearUsuario(UserRolModel usuario){
        return userRolRepository.save(usuario);
    }
}
