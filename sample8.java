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
public class sample8 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine(),res[]=str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            if((res[0].length()>i)){System.out.print(res[0].charAt(i));}
            if((res[1].length()>i)){System.out.print(res[1].charAt(i));}
        }
    }
}
