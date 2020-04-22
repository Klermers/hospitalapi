package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.PatientForm;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PatientFormSQL implements PatientFormDao {
    @Override
    public int insertPatientForm(UUID id, PatientForm patientform) {
        return 0;
    }

    @Override
    public Optional<PatientForm> SelectPatientFormById(UUID Id) {
        return Optional.empty();
    }

    @Override
    public int updatePatientFormById(UUID id, PatientForm patientForm) {
        return 0;
    }

    @Override
    public int deletePatientFormById(UUID id) {
        return 0;
    }

    @Override
    public List<PatientForm> getAllPatientForms() {
        return null;
    }
}
