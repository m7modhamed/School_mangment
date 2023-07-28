/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

/**
 *
 * @author m7mod
 */
public class Student extends Person{
    private String parentPhoneNumber;

    public Student( String name, int age , String parentPhoneNumber) {
        super(name, age);
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public Student() {
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    @Override
       public String getData(){
       return this.getName()+" "+this.getAge()+" "+this.getParentPhoneNumber();
       };
 
    
}
