package com.xworkz.doctor;

import com.xworkz.doctor.controller.DoctorController;
import com.xworkz.doctor.dto.DoctorDto;

public class DoctorRunner {

    public static void main(String[] args) {

        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setYearsOfExperience((byte) 15);
        doctorDto.setMaxPatientsPerDay((short) 50);
        doctorDto.setGender('f');
        doctorDto.setDoctorId(102);
        doctorDto.setAverageRating(4.7F);
        doctorDto.setContactNumber(8796954478L);
        doctorDto.setConsultationFee(2500.0);
        doctorDto.setAvailable(true);

        DoctorController doctorController = new DoctorController();
        doctorController.saveData(doctorDto);

    }
}