package com.klermers.github.hospitalapi.Dao;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.entities.Patient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientDao {

    int insertPatient(UUID id, Patient patient);

    default int insertPatient(Patient patient){
        UUID id = UUID.randomUUID();
        return  insertPatient(id,patient);
    }

    Optional<Patient> SelectPatientById(UUID Id);

    int updatePatientById(UUID id, Patient patient);

    int deletePatientById(UUID id);

    List<Patient> getAllPatients();


}
