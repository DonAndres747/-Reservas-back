package com.example.reservasback.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.reservasback.models.UserRolModel;
import com.example.reservasback.services.UserRolService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/userRol")
public class UserRolController {
    @Autowired
    UserRolService userRolService;

    @GetMapping()
    public ArrayList<UserRolModel> obtenerUserRol(){
        return  userRolService.obtenerUserRol();
    }

    @PostMapping()
    public UserRolModel crearUserRol(@RequestBody UserRolModel rol){
        return this.userRolService.crearUserRol(rol);
    }

    @GetMapping( path = "/{roleId}")
    public Optional<UserRolModel> obtenerUserRolPorId(@PathVariable("roleId") Long roleId ){
        return this.userRolService.obtenerPorId(roleId);
    }
    
    @GetMapping( path = "/query")
    public ArrayList<UserRolModel> obternetPorDescripcion(@RequestParam("description") String description ){
        return this.userRolService.obtenerPorDescripcion(description);
    }

    @DeleteMapping(path = "/{roleId}")
    public String eliminarPorId(@PathVariable("roleId") Long roleId){
        boolean ok = this.userRolService.eliminarUserRol(roleId);
        if(ok){
            return "se elimino el usuario con id " +roleId;
        }else{
            return "No pudo eliminar el usuario con id " +roleId;
        }
    }
}