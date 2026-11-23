package com.xworkz.doctor.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor

public class DoctorDto {

    private byte yearsOfExperience;
    private short maxPatientsPerDay;
    private char gender;
    private int doctorId;
    private float averageRating;
    private long contactNumber;
    private double consultationFee;
    private boolean available;

}
