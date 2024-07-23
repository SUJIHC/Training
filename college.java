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
public class college extends Student {
    private String college_name;
    private int year;

    public college(String college_name, int year, String rollno, String name, String DOB) {
        super(rollno, name, DOB);
        this.college_name = college_name;
        this.year = year;
    }

    public String getCollege_name() {
        return college_name;
    }

    public int getYear() {
        return year;
    }
    
}
