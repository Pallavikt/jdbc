package com.xworkz.bookmyshow.dao.impl;

import com.xworkz.bookmyshow.dao.Dao;
import com.xworkz.bookmyshow.dto.Dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoImpl implements Dao {

    String url = "jdbc:MySql://localhost:3306/bookmyshow_db";
    String user = "root";
    String password = "1234";

    public void saveData(Dto dto){
        System.out.println("u r in dao");
        System.out.println(dto.getMovieName());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("connection Successful");
    }
}
