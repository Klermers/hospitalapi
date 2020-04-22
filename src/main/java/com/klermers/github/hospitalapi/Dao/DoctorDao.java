package com.klermers.github.hospitalapi.Dao;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.klermers.github.hospitalapi.entities.Doctor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DoctorDao {

    int insertDoctor(UUID id, Doctor doctor);

    default int insertDoctor(Doctor doctor){
        UUID id = UUID.randomUUID();
        return  insertDoctor(id,doctor);
    }

    Optional<Doctor> SelectDoctorById(UUID Id);

    int updateDoctorById(UUID id, Doctor doctor);

    int deleteDoctorById(UUID id);

    List<Doctor> getAllDoctors();
}
