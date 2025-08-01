package com.example.management.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private Long phone;
    @Column(name = "password_hash")
    private String passwordHash;
    @Column(name = "is_admin", columnDefinition = "boolean default false")
    private Boolean isAdmin;


}
