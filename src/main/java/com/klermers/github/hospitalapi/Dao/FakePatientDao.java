package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePatientDao implements PatientDao {

    private static List<Patient> DB = new ArrayList<>();

    @Override
    public int insertPatient(UUID id, Patient patient) {
        return 0;
    }

    @Override
    public Optional<Patient> SelectPatientById(UUID Id) {
        return Optional.empty();
    }

    @Override
    public int updatePatientById(UUID id, Patient patient) {
        return 0;
    }

    @Override
    public int deletePatientById(UUID id) {
        return 0;
    }

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }
}
