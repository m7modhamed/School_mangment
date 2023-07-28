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
public class Teacher extends Person{
    private float salary;

    public Teacher( String name, int age , float salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

   
    
    @Override
       public String getData(){
       return this.getName()+" "+this.getAge()+" "+this.getSalary();
       };
    
}
