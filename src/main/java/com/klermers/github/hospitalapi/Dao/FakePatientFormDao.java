package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.entities.Patient;
import com.klermers.github.hospitalapi.entities.PatientForm;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePatientFormDao implements PatientFormDao {

    private static List<PatientForm> DB = new ArrayList<>();

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
