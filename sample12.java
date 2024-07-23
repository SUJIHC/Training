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
interface LibraryUser{
void registerAccount();
void requestBook();
}
class KidUser implements LibraryUser{

    int age;
    String BookType;

    public KidUser(int age, String BookType) {
        this.age = age;
        this.BookType = BookType;
    }
    @Override
    public void registerAccount() {
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry,Age must be less than 12 to register as a Kid");
        }
    }

    @Override
    public void requestBook() {
        if(BookType=="Kids"){
            System.out.println("Book Issued successfully.please return the book with in 10 days");
        }
        else{
            System.out.println("Oops,you are allowed to take only kids books");
        }
    }
    
}
class AdultUser implements LibraryUser{

    int age;
    String BookType;

    public AdultUser(int age, String BookType) {
        this.age = age;
        this.BookType = BookType;
    }
    @Override
    public void registerAccount() {
        if(age>12){
            System.out.println("You have successfully registered under a Adult Account");
        }
        else{
            System.out.println("Sorry,Age must be less than 12 to register as a adult");
        }
    }

    @Override
    public void requestBook() {
        if(BookType=="Fiction"){
            System.out.println("Book Issued successfully.please return the book with in 7 days");
        }
        else{
            System.out.println("Oops,you are allowed to take only adult Fiction books");
        }
    }

}
public class sample12 {
    public static void main(String[] args) {
      LibraryUser k1=new KidUser(10,"Kids");
      LibraryUser k2=new KidUser(12,"Fiction");
      LibraryUser a1=new AdultUser(14,"Adult");
      LibraryUser a2=new AdultUser(19,"Fiction");
      k1.registerAccount();
      k1.requestBook();
      /*k2.registerAccount();
      k2.requestBook();
      a1.registerAccount();
      a1.requestBook();
      a2.registerAccount();
      a2.requestBook();*/
    }
}
