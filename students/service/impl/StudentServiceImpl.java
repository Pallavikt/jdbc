package com.xworkz.students.service.impl;

import com.xworkz.students.dao.StudentDAO;
import com.xworkz.students.dao.impl.StudentDAOImpl;
import com.xworkz.students.dto.StudentDTO;
import com.xworkz.students.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public void saveStudentData(StudentDTO studentDTO) {

        System.out.println("U r in Service");
        System.out.println(studentDTO.getName());

        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.saveStudentData(studentDTO);
    }
}
