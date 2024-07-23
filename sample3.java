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
public class sample3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next(),res=str.substring(0, (str.length()/2));
        System.out.println((str.length()%2==0) ?  res : "null");
    }
}
