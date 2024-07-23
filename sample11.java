/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bad022;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class sample11 {
    static void funA() throws FileNotFoundException{
    try{
        System.out.println("iside funcA");
        throw new FileNotFoundException();
    }
    finally{
        System.out.println("inside finally funcA");
    }
    }
    class MyException extends Exception{
        public MyException(){
            System.out.println("User defined");
        }
        public String toString() {
            return "MyException : Age cannot be<18" ;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       try{
           int age=sc.nextInt();
       }
       finally{
           
       }
    }
}
