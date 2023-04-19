package com.example.demo.persistence.entity;

import jakarta.persistence.*;

@Entity(name = "User")
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long userId;
    @Column(name = "name")
    private String name;

    public User() {
    }

    public User(Long userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
