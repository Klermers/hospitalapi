package com.klermers.github.hospitalapi.Dao;

import com.klermers.github.hospitalapi.entities.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public Optional<Doctor> SelectDoctorById(UUID id) {
        return DB.stream()
                .filter(doctor -> doctor.getId().equals(id)).findFirst();

    }

    @Override
    public int updateDoctorById(UUID id, Doctor doctor) {
        return SelectDoctorById(id)
                .map(p -> {
                    int indexofDoctorToDelete = DB.indexOf(doctor);
                    if(indexofDoctorToDelete >= 0) {
                        DB.set(indexofDoctorToDelete, doctor);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public int deleteDoctorById(UUID id) {
        Optional<Doctor> doctorMaybe = SelectDoctorById((id));
        if(doctorMaybe.isEmpty()){
            return 0;
        }
        DB.remove(doctorMaybe.get());
        return 1;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return DB;
    }
}
