package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class DoctorSQL implements  DoctorDao {
    @Override
    public int insertDoctor(UUID id, Doctor doctor) {
        return 0;
    }

    @Override
    public Optional<Doctor> SelectDoctorById(UUID Id) {
        return Optional.empty();
    }

    @Override
    public int updateDoctorById(UUID id, Doctor doctor) {
        return 0;
    }

    @Override
    public int deleteDoctorById(UUID id) {
        return 0;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return null;
    }
}
