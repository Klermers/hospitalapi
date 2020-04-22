package com.klermers.github.hospitalapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.util.UUID;

public class PatientForm {

    private final UUID id;
    private final String titel;
    private final Date Creationdate;

    public PatientForm(@JsonProperty("id")UUID id,
                       @JsonProperty("titel")String titel,
                       @JsonProperty("date")Date creationdate) {
        this.id = id;
        this.titel = titel;
        Creationdate = creationdate;
    }

    public UUID getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public Date getCreationdate() {
        return Creationdate;
    }
}
