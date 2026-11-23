package com.xworkz.bookmyshow.service.impl;

import com.xworkz.bookmyshow.dao.Dao;
import com.xworkz.bookmyshow.dao.impl.DaoImpl;
import com.xworkz.bookmyshow.dto.Dto;
import com.xworkz.bookmyshow.service.Service;

import javax.xml.stream.events.DTD;

public class ServiceImpl implements Service {

    @Override
    public void saveData(Dto dto) {
        Dao dao = new DaoImpl();
        System.out.println("U r in Service");
        System.out.println(dto.getMovieName());
        dao.saveData(dto);
    }
}
