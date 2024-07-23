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
public class sample4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next(),res=str.substring(1, (str.length())-1);
        System.out.println(res);
    }
}
