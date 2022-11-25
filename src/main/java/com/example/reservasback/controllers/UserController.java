package com.example.reservasback.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservasback.models.UserModel;
import com.example.reservasback.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> obtenerUsuarios(){
        return this.userService.obtenerUsuarios();
    }

    @PostMapping()
    public UserModel crearUsuario(@RequestBody UserModel usuario){
        return this.userService.crearUsuario(usuario);
    }

    @GetMapping( path = "/{userId}")
    public Optional<UserModel> obtenerUserRolPorId(@PathVariable("roleId") Long userId ){
        return this.userService.obtenerPorId(userId);
    }
    
    @DeleteMapping(path = "/{userId}")
    public String eliminarPorId(@PathVariable("userId") Long userId){
        boolean ok = this.userService.eliminarUsuario(userId);
        if(ok){
            return "se elimino el usuario con id " +userId;
        }else{
            return "No pudo eliminar el usuario con id " +userId;
        }
    }
}
