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
public class sample2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(1));
        }
    }
}
