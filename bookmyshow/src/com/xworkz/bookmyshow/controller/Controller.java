package com.xworkz.bookmyshow.controller;

import com.xworkz.bookmyshow.dto.Dto;
import com.xworkz.bookmyshow.service.Service;
import com.xworkz.bookmyshow.service.impl.ServiceImpl;

public class Controller {

    Dto dto =  new Dto();
    public static void saveData(Dto dto){
        Service service = new ServiceImpl();
        System.out.println("u r in controller");
        System.out.println(dto.getMovieName());
        service.saveData(dto);
    }

}