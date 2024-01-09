/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinformationdetails;

/**
 *
 * @author rasel
 */
import java.io.Serializable;

public class StudentInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private double grades;

    public StudentInfo(String name, double grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grades: " + grades;
    }
}

