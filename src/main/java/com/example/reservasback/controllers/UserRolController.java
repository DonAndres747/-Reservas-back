package com.example.reservasback.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.reservasback.models.UserRolModel;
import com.example.reservasback.services.UserRolService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/usuario")
public class UserRolController {
    @Autowired
    UserRolService userRolService;

    @GetMapping()
    public ArrayList<UserRolModel> obtenerUsuarios(){
        return  userRolService.obtenerUsuarios();
    }

    @PostMapping()
    public UserRolModel crearUsuario(@RequestBody UserRolModel usuario){
        return this.userRolService.crearUsuario(usuario);
    }
}