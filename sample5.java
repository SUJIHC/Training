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
public class sample5{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next(),res=sc.next();
    System.out.println((str.length()>res.length()) ?  (res+str+res) :(str+res+str) );
    }
}
