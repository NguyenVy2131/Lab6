/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainjdialog;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Student implements Serializable{
    private String studentID;
    private String lastNmae;
    private String midName;
    private String firstName;
    private int yearOfBirth;
    private String gender;
    private String schoolStage;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }

    public Student(String studentID, String lastNmae, String midName, String firstName, int yearOfBirth, String gender, String schoolStage) {
        this.studentID = studentID;
        this.lastNmae = lastNmae;
        this.midName = midName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }
   
}
