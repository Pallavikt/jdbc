package com.xworkz.students.runner;

import com.xworkz.students.controller.StudentController;
import com.xworkz.students.dto.StudentDTO;

public class Runner {
    public static void main(String[] args) {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName("bbb");
        studentDTO.setEmail("xxxx@gmail.com");
        studentDTO.setUsn("jjjj");
        studentDTO.setPhoNo(101010101010L);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setName("Aarav Sharma");
        studentDTO1.setEmail("aarav.sharma@gmail.com");
        studentDTO1.setUsn("1RV21CS001");
        studentDTO1.setPhoNo(9876543210L);

        StudentDTO studentDTO2 = new StudentDTO();
        studentDTO2.setName("Diya Patel");
        studentDTO2.setEmail("diya.patel@gmail.com");
        studentDTO2.setUsn("1RV21CS002");
        studentDTO2.setPhoNo(9876543211L);

        StudentDTO studentDTO3 = new StudentDTO();
        studentDTO3.setName("Rohan Verma");
        studentDTO3.setEmail("rohan.verma@gmail.com");
        studentDTO3.setUsn("1RV21CS003");
        studentDTO3.setPhoNo(9876543212L);

        StudentDTO studentDTO4 = new StudentDTO();
        studentDTO4.setName("Ananya Nair");
        studentDTO4.setEmail("ananya.nair@gmail.com");
        studentDTO4.setUsn("1RV21CS004");
        studentDTO4.setPhoNo(9876543213L);

        StudentDTO studentDTO5 = new StudentDTO();
        studentDTO5.setName("Vikram Singh");
        studentDTO5.setEmail("vikram.singh@gmail.com");
        studentDTO5.setUsn("1RV21CS005");
        studentDTO5.setPhoNo(9876543214L);

        StudentDTO studentDTO6 = new StudentDTO();
        studentDTO6.setName("Sneha Reddy");
        studentDTO6.setEmail("sneha.reddy@gmail.com");
        studentDTO6.setUsn("1RV21CS006");
        studentDTO6.setPhoNo(9876543215L);

        StudentDTO studentDTO7 = new StudentDTO();
        studentDTO7.setName("Karthik Rao");
        studentDTO7.setEmail("karthik.rao@gmail.com");
        studentDTO7.setUsn("1RV21CS007");
        studentDTO7.setPhoNo(9876543216L);

        StudentDTO studentDTO8 = new StudentDTO();
        studentDTO8.setName("Meera Joshi");
        studentDTO8.setEmail("meera.joshi@gmail.com");
        studentDTO8.setUsn("1RV21CS008");
        studentDTO8.setPhoNo(9876543217L);

        StudentDTO studentDTO9 = new StudentDTO();
        studentDTO9.setName("Aditya Kulkarni");
        studentDTO9.setEmail("aditya.kulkarni@gmail.com");
        studentDTO9.setUsn("1RV21CS009");
        studentDTO9.setPhoNo(9876543218L);

        StudentDTO studentDTO10 = new StudentDTO();
        studentDTO10.setName("Pooja Hegde");
        studentDTO10.setEmail("pooja.hegde@gmail.com");
        studentDTO10.setUsn("1RV21CS010");
        studentDTO10.setPhoNo(9876543219L);

        StudentDTO studentDTO11 = new StudentDTO();
        studentDTO11.setName("Siddharth Menon");
        studentDTO11.setEmail("siddharth.menon@gmail.com");
        studentDTO11.setUsn("1RV21CS011");
        studentDTO11.setPhoNo(9876543220L);

        StudentDTO studentDTO12 = new StudentDTO();
        studentDTO12.setName("Kavya Iyer");
        studentDTO12.setEmail("kavya.iyer@gmail.com");
        studentDTO12.setUsn("1RV21CS012");
        studentDTO12.setPhoNo(9876543221L);

        StudentDTO studentDTO13 = new StudentDTO();
        studentDTO13.setName("Nikhil Gowda");
        studentDTO13.setEmail("nikhil.gowda@gmail.com");
        studentDTO13.setUsn("1RV21CS013");
        studentDTO13.setPhoNo(9876543222L);

        StudentDTO studentDTO14 = new StudentDTO();
        studentDTO14.setName("Riya Das");
        studentDTO14.setEmail("riya.das@gmail.com");
        studentDTO14.setUsn("1RV21CS014");
        studentDTO14.setPhoNo(9876543223L);

        StudentDTO studentDTO15 = new StudentDTO();
        studentDTO15.setName("Arjun Bhat");
        studentDTO15.setEmail("arjun.bhat@gmail.com");
        studentDTO15.setUsn("1RV21CS015");
        studentDTO15.setPhoNo(9876543224L);

        StudentDTO studentDTO16 = new StudentDTO();
        studentDTO16.setName("Nandini Shetty");
        studentDTO16.setEmail("nandini.shetty@gmail.com");
        studentDTO16.setUsn("1RV21CS016");
        studentDTO16.setPhoNo(9876543225L);

        StudentDTO studentDTO17 = new StudentDTO();
        studentDTO17.setName("Pranav Deshmukh");
        studentDTO17.setEmail("pranav.deshmukh@gmail.com");
        studentDTO17.setUsn("1RV21CS017");
        studentDTO17.setPhoNo(9876543226L);

        StudentDTO studentDTO18 = new StudentDTO();
        studentDTO18.setName("Shruti Agarwal");
        studentDTO18.setEmail("shruti.agarwal@gmail.com");
        studentDTO18.setUsn("1RV21CS018");
        studentDTO18.setPhoNo(9876543227L);

        StudentDTO studentDTO19 = new StudentDTO();
        studentDTO19.setName("Varun Malhotra");
        studentDTO19.setEmail("varun.malhotra@gmail.com");
        studentDTO19.setUsn("1RV21CS019");
        studentDTO19.setPhoNo(9876543228L);

        StudentDTO studentDTO20 = new StudentDTO();
        studentDTO20.setName("Tanvi Gupta");
        studentDTO20.setEmail("tanvi.gupta@gmail.com");
        studentDTO20.setUsn("1RV21CS020");
        studentDTO20.setPhoNo(9876543229L);

        StudentController studentController = new StudentController();
        studentController.saveStudent(studentDTO);
        studentController.saveStudent(studentDTO1);
        studentController.saveStudent(studentDTO2);
        studentController.saveStudent(studentDTO3);
        studentController.saveStudent(studentDTO4);
        studentController.saveStudent(studentDTO5);
        studentController.saveStudent(studentDTO6);
        studentController.saveStudent(studentDTO7);
        studentController.saveStudent(studentDTO8);
        studentController.saveStudent(studentDTO9);
        studentController.saveStudent(studentDTO10);
        studentController.saveStudent(studentDTO11);
        studentController.saveStudent(studentDTO12);
        studentController.saveStudent(studentDTO13);
        studentController.saveStudent(studentDTO14);
        studentController.saveStudent(studentDTO15);
        studentController.saveStudent(studentDTO16);
        studentController.saveStudent(studentDTO17);
        studentController.saveStudent(studentDTO18);
        studentController.saveStudent(studentDTO19);
        studentController.saveStudent(studentDTO20);

    }
}
