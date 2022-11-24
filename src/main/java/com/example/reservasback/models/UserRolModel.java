package com.example.reservasback.models;

import javax.persistence.*;

@Entity
@Table(name = "userRol")
public class UserRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long Id;

    private String description;

    public long getId() {
        return Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
