package com.xworkz.students.dao.impl;

import com.xworkz.students.dao.StudentDAO;
import com.xworkz.students.dto.StudentDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAOImpl implements StudentDAO {

    String url = "jdbc:MySql://localhost:3306/student_db";
    String user = "root";
    String password = "1234";

    public void saveStudentData(StudentDTO studentDTO) {
        System.out.println("U r in DAO");
        System.out.println(studentDTO.getName());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);

            System.out.println("connection Successful");

            Statement statement = connection.createStatement();
            String sql = "insert into student(name,email,usn,phone_no) values('"+studentDTO.getName()+"','"+studentDTO.getEmail()+"', '"+studentDTO.getUsn()+"','"+studentDTO.getPhoNo()+"')";

            int result = statement.executeUpdate(sql);
            System.out.println(result);

            connection.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}