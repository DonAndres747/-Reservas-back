package com.example.reservasback.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.reservasback.models.UserRolModel;

@Repository
public interface UserRolRepository extends CrudRepository<UserRolModel, Long> {
    public abstract ArrayList<UserRolModel> findByDescription(String description);
}
