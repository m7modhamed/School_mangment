/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import schoolmanagement.Grade;
import schoolmanagement.School;
import schoolmanagement.Student;
import schoolmanagement.Teacher;

/**
 *
 * @author m7mod
 */
public class SChoolServices {
    School school;

    public SChoolServices(School school) {
        this.school = school;
    }

    public SChoolServices() {
    }

    public School getSchool() {
        return school;
    }
 
    public void addStudent(Student student){
        this.school.getStudent().add(student);
    }
    
 public void addTeacher(Teacher teacher){
        this.school.getTeacher().add(teacher);
    }
 
 
 public void addGrade(Grade grade){
        this.school.getGrade().add(grade);
    }
 
   public void removeStudent(Student student){
        this.school.getStudent().remove(student);
    }
   
   public void removeTeacher(Teacher teacher){
        this.school.getTeacher().remove(teacher);
    }
   
    public void removeGrade(Grade grade){
        this.school.getGrade().remove(grade);
    }
    
    public Student getStudentByName(String name){

        for(Student student : this.school.getStudent()){
            if(student.getName().toUpperCase().equals(name.toUpperCase()))        
                return student;
        }
        
             return null;
    }
    
     public Teacher getTeachertByName(String name){

        for(Teacher teacher : this.school.getTeacher()){
            if(teacher.getName().toUpperCase().equals(name.toUpperCase()))        
                return teacher;
        }
        
             return null;
    }
     
     public Grade getGradeByCode(String code){

        for(Grade grade : this.school.getGrade()){
            if(grade.getCode().equals(code))        
                return grade;
        }
        
             return null;
    }
     
     
}