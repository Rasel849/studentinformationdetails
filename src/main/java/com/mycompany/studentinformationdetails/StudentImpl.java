/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinformationdetails;

/**
 *
 * @author rasel
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class StudentImpl extends UnicastRemoteObject implements Student {
    private Map<Integer, StudentInfo> students;

    public StudentImpl() throws RemoteException {
        students = new HashMap<>();
    }

    @Override
    public void addStudent(String name, int id, double grades) throws RemoteException {
        students.put(id, new StudentInfo(name, grades));
        System.out.println("Student added: " + id);
    }

    @Override
    public String getStudent(int id) throws RemoteException {
        StudentInfo student = students.get(id);
        return (student != null) ? student.toString() : "Student not found";
    }

    @Override
    public void updateStudent(int id, String name, double grades) throws RemoteException {
        if (students.containsKey(id)) {
            students.put(id, new StudentInfo(name, grades));
            System.out.println("Student updated: " + id);
        } else {
            System.out.println("Student not found: " + id);
        }
    }

    public static void main(String[] args) {
        try {
            Student studentService = new StudentImpl();
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            java.rmi.Naming.rebind("StudentService", studentService);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

