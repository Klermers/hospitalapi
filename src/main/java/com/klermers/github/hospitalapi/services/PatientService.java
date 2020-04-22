package com.klermers.github.hospitalapi.services;

import com.klermers.github.hospitalapi.Dao.DoctorDao;
import com.klermers.github.hospitalapi.Dao.PatientDao;
import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientService {

    private final PatientDao patientDao;

    @Autowired
    public PatientService(@Qualifier("fakeDao") PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    public int addPatient(Patient patient){
        return patientDao.insertPatient(patient);
    }

    public List<Patient> getAllPeople(){
        return patientDao.getAllPatients();
    }

    public Optional<Patient> getPatientById(UUID id){
        return patientDao.SelectPatientById(id);
    }

    public int deletePatient(UUID id){
        return  patientDao.deletePatientById(id);
    }

    public int updatePatient(UUID id, Patient patient){
        return patientDao.updatePatientById(id, patient);
    }
}
