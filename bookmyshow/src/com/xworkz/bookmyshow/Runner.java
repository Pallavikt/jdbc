package com.xworkz.bookmyshow;

import com.xworkz.bookmyshow.controller.Controller;
import com.xworkz.bookmyshow.dto.Dto;

public class Runner {
    public static void main(String[] args) {

        Dto dto = new Dto();
        dto.setMovieName("Ranabaali");
        dto.setId(1);
        dto.setTicketPrice(200);

        Controller controller = new Controller();
        controller.saveData(dto);
    }
}
