package com.klermers.github.hospitalapi.controllers;

import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/doctor")
@RestController
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Doctor getDoctorById(@PathVariable("id") UUID id){
        return  doctorService.getDoctorById(id).orElse(null);
    }
}
