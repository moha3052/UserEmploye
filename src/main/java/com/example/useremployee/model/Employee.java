package com.example.useremployee.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDateTime born;
    private boolean vegetarian;
    private Gender gender;

    @OneToOne
    @JoinColumn (name = "useridFK", referencedColumnName = "userID")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBorn() {
        return born;
    }

    public void setBorn(LocalDateTime born) {
        this.born = born;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
