package com.klermers.github.hospitalapi.controllers;

import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
