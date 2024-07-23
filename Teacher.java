/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author CCLAB
 */
public class Teacher extends person{
    private String subject;
    private int salary;

    public Teacher(String subject, int salary, String name, String DOB) {
        super(name, DOB);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public int getSalary() {
        return salary;
    }
    
}
