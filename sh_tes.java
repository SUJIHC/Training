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
public class sh_tes{
public static class Shapes {
    void draw(){
        System.out.println("Drawing  shapes");
    }
    void erase(){
        System.out.println("Ereasing shape");
    }
}
public static class circle extends Shapes{

        @Override
        void erase() {
            System.out.println("Drawing circle"); 
        }

        @Override
        void draw() {
            System.out.println("Ereasing Circle");
        }
    }

public static class square extends Shapes{

        @Override
        void erase() {
            System.out.println("Drawing square"); 
        }

        @Override
        void draw() {
            System.out.println("Ereasing square");
        }
    }

public static class triangle extends Shapes{

        @Override
        void erase() {
            System.out.println("Drawing triangle"); 
        }

        @Override
        void draw() {
            System.out.println("Ereasing triangle");
        }
    }
public static void main(String[] args){
Shapes sp=new Shapes();
square s=new square();
circle c=new circle();
triangle t=new triangle();
sp.draw();
sp.erase();
s.draw();
s.erase();
c.draw();
c.erase();
t.draw();
t.erase();
}
}
