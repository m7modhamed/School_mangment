/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import Services.SChoolServices;
import java.util.Scanner;

/**
 *
 * @author m7mod
 */
public class JUI {
    private static SChoolServices  schoolServices;
    
    public static void start(){
        Scanner input=new Scanner(System.in);
        School school;
        school=JUI.createSchool();
         
        System.out.println("Welcome to "+school.getName()+" in "+school.getAddress());
        String action="";
        do{
            System.out.println("What do you want to do ?");
            action=input.next();
        
            switch (action){
                case "AddStudent" :
                     JUI.addStudent();
                     break;
                case "PrintAllStudents" :
                    JUI.PrintAllStudents();
                    break;
                 case "AddTeacher" :
                    JUI.addTeacher();
                    break;
                 case "PrintAllTeachers" :
                     JUI.PrintAllTeachers();
                     break;
                 case "findStudentByName" :
                     Person p=findPersonByName(1);
                     JUI.printDataPerson(p);
                     break;
                     case "findTeacherByName" :
                     Person p2=findPersonByName(2);
                     JUI.printDataPerson(p2);
                     
                     break;
                      case "removeStudent" :
                     removePerson(1);
                     break;
                      case "removeTeacher" :
                     removePerson(2);
                     break;
            }
         
            
        }while(!action.equals("exit"));
    }
    
    private static School createSchool(){
        School school=new School();
        school.setName("mahmoudSchool");
        school.setAddress("Amman");
        school.setPhoneNumber("0785874347");
        JUI.schoolServices=new SChoolServices(school);
        return school;
    }
    
    private static void addStudent(){       
        Student student=new Student();

        JUI.setPersonData(student);
        JUI.schoolServices.addStudent(student);   
    }
    
    private static void addTeacher(){       
        Teacher teacher=new Teacher();

        JUI.setPersonData(teacher);
        JUI.schoolServices.addTeacher(teacher);  
    }
    
    private static void PrintAllStudents(){
      for(Student student : JUI.schoolServices.getSchool().getStudent())
      {
        System.out.println(student.getData());
         
      }
    }
    
    
    private static void PrintAllTeachers(){
      for(Teacher teacher : JUI.schoolServices.getSchool().getTeacher())
      {
        System.out.println(teacher.getData());
      }
    }
    
    private static void setPersonData(Person p){
       Scanner input=new Scanner(System.in);        

        System.out.println("plz Enter student name :");
        p.setName(input.next());   
        System.out.println("plz Enter student age :");
        p.setAge(input.nextInt());  
        if(p instanceof Student){
        System.out.println("plz Enter student Phone Number :");
        ((Student)p).setParentPhoneNumber(input.next());

        }
        if(p instanceof Teacher){
        System.out.println("plz Enter student Teacher salary :");
        ((Teacher)p).setSalary(input.nextInt());

        }
      
    }
    
    
    private static Person findPersonByName(int action){
      Scanner input=new Scanner(System.in);  

       System.out.println("Enter the name :");
       String  name=input.next();
       Person p;
       if(action == 1){
           p=JUI.schoolServices.getStudentByName(name);
       }else{
       p=JUI.schoolServices.getTeachertByName(name);
       }
       
       return p;
    }
    
    private static void printDataPerson(Person person){
    if(person != null){
        System.out.println(person.getData());
       }else{
           System.out.println("the student is not exist");
       }
    }
    
    
    private static void removePerson(int action){
        Person p;
        if(action == 1){
          p=JUI.findPersonByName(1);
        }else{
         p=JUI.findPersonByName(2);
        }
        if(p instanceof Student){
        JUI.schoolServices.removeStudent((Student)p);
        }else{
          JUI.schoolServices.removeTeacher((Teacher)p);
        }
    }
    
}
