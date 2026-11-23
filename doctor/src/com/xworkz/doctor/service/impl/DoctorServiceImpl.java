package com.xworkz.doctor.service.impl;

import com.xworkz.doctor.dao.DoctorDao;
import com.xworkz.doctor.dao.impl.DoctorDaoImpl;
import com.xworkz.doctor.dto.DoctorDto;
import com.xworkz.doctor.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

    @Override
    public void saveData(DoctorDto doctorDto) {
        System.out.println("u r in service layer");

        DoctorDao dao = new DoctorDaoImpl();
        dao.saveData(doctorDto);
    }
}
