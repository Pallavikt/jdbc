package com.xworkz.doctor.controller;

import com.xworkz.doctor.dto.DoctorDto;
import com.xworkz.doctor.service.DoctorService;
import com.xworkz.doctor.service.impl.DoctorServiceImpl;

public class DoctorController {

    public void saveData(DoctorDto doctorDto){
        System.out.println("u r in controller layer");

        DoctorService doctorService = new DoctorServiceImpl();
        doctorService.saveData(doctorDto);
    }
}
