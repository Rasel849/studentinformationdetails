/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinformationdetails;

/**
 *
 * @author rasel
 */
import java.rmi.Naming;

public class StudentClient {
    public static void main(String[] args) {
        try {
            Student studentService = (Student) Naming.lookup("rmi://localhost/StudentService");

            // Adding a student
            studentService.addStudent("Mim", 201311198, 3.68);

            // Retrieving a student
            String studentInfo = studentService.getStudent(201311198);
            System.out.println("Student Info: " + studentInfo);

            // Updating a student
            studentService.updateStudent(201311198, "Nusrat", 3.88);

            // Retrieving the updated student
            studentInfo = studentService.getStudent(201311198);
            System.out.println("Updated Student Info: " + studentInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
