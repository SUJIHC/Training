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
public class Fruit{
    String Name;
    String Taste;
    String size;

    public Fruit(String Name, String Taste,String size) {
        this.Name = Name;
        this.Taste = Taste;
        this.size = size;
    }
    void  eat(){
        System.out.println("Name "+Name+"\nTaste "+Taste);
    }
    
  
}
  

