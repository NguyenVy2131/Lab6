/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainjdialog;

import java.util.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author LENOVO
 */
public class StudentManager {

    private ArrayList<Student> ListStudent;

    public ArrayList<Student> getListStudent() {
        return ListStudent;
    }

    public void setListStudent(ArrayList<Student> ListStudent) {
        this.ListStudent = ListStudent;
    }

    public StudentManager() {
        loadStudent();

    }

    public Student findStudentById(String studentID) {
        for (Student stu : ListStudent) {
            if (stu.getStudentID() == studentID) {
                return stu;
            }
        }
        return null;
    }

    public boolean addStudent(Student stu) {
        boolean flag = true;
        for (Student student : ListStudent) {
            if (student.getStudentID() == stu.getStudentID()) {
                return false;
            }
        }
        if (flag) {
            ListStudent.add(stu);
            saveStudent();
            return true;
        } else {
            return false;
        }
    }

    public void saveStudent() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.Dat"))) {
            oos.writeObject(ListStudent);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error save file" + e.getMessage());
        }
    }

    public void loadStudent() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.Dat"))) {
            ListStudent = (ArrayList<Student>) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error load file");
        }
    }
}
