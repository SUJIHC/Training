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
public class samp {
    public static class Apple extends Fruit{
        
        public Apple(String Name, String Taste, String size) {
            super(Name, Taste, size);
        }

        @Override
        void eat() {
            System.out.println("Taste1 "+Taste); 
        }
        
    }
    public static class orange extends Fruit{
        
        public orange(String Name, String Taste, String size) {
            super(Name, Taste, size);
        }
        @Override
        void eat() {
            System.out.println("Name1 "+Name); 
        }
    }    
       public static void main(String [] args){
        Fruit f=new Fruit("Mango","Sweet","Large");
        f.eat();
        Apple a=new Apple ("Apple","Salty","Medium");
        a.eat();
        orange o=new orange("Orange","Sore","Small");
        o.eat();
    
    }
}
