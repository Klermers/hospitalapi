package com.klermers.github.hospitalapi.entities;

import java.util.UUID;

public class Doctor {

    private final UUID id;
    private final String username;
    private final String password;
    private final String firstname;
    private final String lastname;

    public Doctor(UUID id, String username, String password, String firstname, String lastname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
