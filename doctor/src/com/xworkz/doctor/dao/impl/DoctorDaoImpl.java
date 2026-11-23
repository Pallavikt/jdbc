package com.xworkz.doctor.dao.impl;

import com.xworkz.doctor.dao.DoctorDao;
import com.xworkz.doctor.dto.DoctorDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorDaoImpl implements DoctorDao {

    String url = "jdbc:mysql://localhost:3306/doctors_db";
    String user = "root";
    String password = "1234";

    @Override
    public void saveData(DoctorDto doctorDto) {
        System.out.println("u r in dao layer");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);

            System.out.println("Connection successful");

            Statement statement = connection.createStatement();
            String sql = "insert into doctor(yearsOfExperience,maxPatientsPerDay,gender,doctor_id,averageRating,contact_no,consultationFee,available) values("+doctorDto.getYearsOfExperience()+","+doctorDto.getMaxPatientsPerDay()+",'"+doctorDto.getGender()+"',"+doctorDto.getDoctorId()+","+doctorDto.getAverageRating()+","+doctorDto.getContactNumber()+","+doctorDto.getConsultationFee()+","+doctorDto.isAvailable()+")";

            int result = statement.executeUpdate(sql);
            System.out.println(result);

            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}