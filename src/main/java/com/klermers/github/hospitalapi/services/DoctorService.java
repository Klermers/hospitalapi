package com.klermers.github.hospitalapi.services;

import com.klermers.github.hospitalapi.Dao.DoctorDao;
import com.klermers.github.hospitalapi.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
