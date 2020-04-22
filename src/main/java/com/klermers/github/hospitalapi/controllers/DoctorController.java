package com.klermers.github.hospitalapi.controllers;

import com.klermers.github.hospitalapi.entities.Doctor;
import com.klermers.github.hospitalapi.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    public void addDoctor(@Valid @NotNull @RequestBody Doctor doctor){
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

    @PutMapping(path = "{id}")
    public void updateDoctor(@PathVariable("id")UUID id,@Valid @NotNull @RequestBody Doctor doctor){
        doctorService.updateDoctor(id,doctor);
    }

    @DeleteMapping(path = "{id}")
    public void deleteDoctorById(@PathVariable("id")UUID id) {
        doctorService.deleteDoctor(id);
    }
}
