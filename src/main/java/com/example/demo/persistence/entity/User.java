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

    @Column(name = "pass_word")
    private String password;

    public User() {
    }

    public User(Long userId, String name, String password) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
