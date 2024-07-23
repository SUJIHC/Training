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
public class Student extends person {
    private String rollno;

    public Student(String rollno, String name, String DOB) {
        super(name, DOB);
        this.rollno = rollno;
    }

    public String getRollno() {
        return rollno;
    }
    
    
}
