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
public class Sample1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine(),res[]=str.split(",");
    System.out.println((res[0].charAt(res[0].length()-1)== res[1].charAt(0)) ? (res[0].toLowerCase()+""+res[1].substring(1, res[1].length()).toLowerCase()): (res[0].toLowerCase()+" "+res[1].toLowerCase()));
    }
}
