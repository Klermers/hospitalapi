package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.entities.PatientForm;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientFormDao {

    int insertPatientForm(UUID id, PatientForm patientform);

    default int insertPatientForm(PatientForm patientform){
        UUID id = UUID.randomUUID();
        return  insertPatientForm(id,patientform);
    }

    Optional<PatientForm> SelectPatientFormById(UUID Id);

    int updatePatientFormById(UUID id, PatientForm patientForm);

    int deletePatientFormById(UUID id);

    List<PatientForm> getAllPatientForms();
}
