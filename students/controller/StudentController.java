package com.xworkz.students.controller;

import com.xworkz.students.dto.StudentDTO;
import com.xworkz.students.service.StudentService;
import com.xworkz.students.service.impl.StudentServiceImpl;

public class StudentController {

    public void saveStudent(StudentDTO studentDTO){

        System.out.println("u r in Controller");
        System.out.println(studentDTO.getName());

        StudentService studentService = new StudentServiceImpl();
        studentService.saveStudentData(studentDTO);
    }

}
