package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;

import java.util.List;
import java.util.UUID;

public interface DoctorDao {

    int insertDoctor(UUID id, Doctor doctor);

    default int insertDoctor(Doctor doctor){
        UUID id = UUID.randomUUID();
        return  insertDoctor(id,doctor);
    }

    List<Doctor> getAllDoctors();
}
