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
public class BAD022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.next(),res="";
        for (int i = str.length()-1;i>=0; i--) {
            res+=str.charAt(i);
        }
        System.out.println(res.equals(str) ? "Palindrome" : "Not Palindrome");
        
    }
    
}
