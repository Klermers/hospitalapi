package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeDoctorDao implements DoctorDao {

    private static List<Doctor> DB = new ArrayList<>();

    @Override
    public int insertDoctor(UUID id, Doctor doctor){
        DB.add(new Doctor(id,doctor.getUsername(),doctor.getPassword(),doctor.getFirstname(),doctor.getLastname()));
        return 1;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return DB;
    }
}
