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
public class sample9 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int n=sc.nextInt();
    String res=str.substring((str.length()-n));
        for (int i = 0; i < n; i++) {
            System.out.print(res);
        }
        
    }
}
