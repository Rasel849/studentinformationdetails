/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.studentinformationdetails;

/**
 *
 * @author rasel
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Student extends Remote {
    void addStudent(String name, int id, double grades) throws RemoteException;
    String getStudent(int id) throws RemoteException;
    void updateStudent(int id, String name, double grades) throws RemoteException;
}
