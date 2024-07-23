/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author CCLAB
 * 
 */
public class Test  {
    public static void main(String [] args){
        college obj=new college("MCET",4,"BEE093","VASAN","09/12/2003");
        Teacher obj1=new Teacher("Data",50000,"VASAN","09/12/2003");
        System.out.println(obj.getCollege_name());
        System.out.println(obj.getDOB());
        System.out.println(obj.getName());
        System.out.println(obj.getRollno());
        System.out.println(obj.getYear());
        System.out.println(obj1.getSubject());
        System.out.println(obj1.getSalary());
    }
}
