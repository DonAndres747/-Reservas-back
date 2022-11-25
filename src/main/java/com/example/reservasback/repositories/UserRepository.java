package com.example.reservasback.repositories;

import org.springframework.stereotype.Repository;

import com.example.reservasback.models.UserModel;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{

}
