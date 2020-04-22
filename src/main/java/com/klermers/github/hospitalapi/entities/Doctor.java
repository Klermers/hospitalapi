package com.klermers.github.hospitalapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Doctor {

    private final UUID id;
    @NotBlank
    private final String username;
    @NotBlank
    private final String password;
    private final String firstname;
    private final String lastname;

    public Doctor(@JsonProperty("id") UUID id,
                  @JsonProperty("username")String username,
                  @JsonProperty("password")String password,
                  @JsonProperty("firstname")String firstname,
                  @JsonProperty("lastname")String lastname) {
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
