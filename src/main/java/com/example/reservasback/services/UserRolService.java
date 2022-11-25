package com.example.reservasback.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservasback.models.UserRolModel;
import com.example.reservasback.repositories.UserRolRepository;

@Service
public class UserRolService {
    @Autowired
    UserRolRepository userRolRepository;

    public ArrayList<UserRolModel> obtenerUserRol(){
        return (ArrayList<UserRolModel>) userRolRepository.findAll();
    }

    public UserRolModel crearUserRol(UserRolModel rol){
        return userRolRepository.save(rol);
    }

    public Optional<UserRolModel> obtenerPorId(Long roleId){
        return userRolRepository.findById(roleId);
    }
    
    public ArrayList<UserRolModel> obtenerPorDescripcion(String description){
        return userRolRepository.findByDescription(description);
    }

    public boolean eliminarUserRol(Long roleId){
        try {
            userRolRepository.deleteById(roleId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
