package com.klermers.github.hospitalapi.services;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.klermers.github.hospitalapi.Dao.DoctorDao;
import com.klermers.github.hospitalapi.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DoctorService {

    private final DoctorDao doctorDao;

    @Autowired
    public DoctorService(@Qualifier("fakeDao") DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    public int addDoctor(Doctor doctor){
        return doctorDao.insertDoctor(doctor);
    }

    public List<Doctor> getAllPeople(){
        return doctorDao.getAllDoctors();
    }

    public Optional<Doctor> getDoctorById(UUID id){
        return doctorDao.SelectDoctorById(id);
    }

    public int deleteDoctor(UUID id){
        return  doctorDao.deleteDoctorById(id);
    }

    public int updateDoctor(UUID id, Doctor doctor){
        return doctorDao.updateDoctorById(id, doctor);
    }

}
