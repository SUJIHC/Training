/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bad022;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class sample7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next(),res="";
        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
               //res+=str.charAt(i);
            } 
            else{
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }    
}
