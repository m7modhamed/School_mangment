/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import java.util.ArrayList;

/**
 *
 * @author m7mod
 */
public class School {
    private String name;
    private String address;
    private String PhoneNumber;
    ArrayList<Student> student;
     ArrayList<Teacher> teacher;
     ArrayList<Grade> grade;

    public School() {
        initObject();
    }

    public School(String name) {
        this.name = name;
        initObject();
    }

    private void initObject(){
    this.student=new ArrayList<Student>();
    this.teacher=new ArrayList<Teacher>();
    this.grade=new ArrayList<Grade>();
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

   

    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }


    public ArrayList<Grade> getGrade() {
        return grade;
    }

     
}
