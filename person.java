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
public class person{
    private String name;
    private String DOB;
    public person(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }
    
}
