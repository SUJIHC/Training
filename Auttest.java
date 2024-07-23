/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author CCLAB
 */
public class Auttest {
    public static class Author{
        String AName;
        char Gender;
        String email;

        public Author(String AName, char Gender, String email) {
            this.AName = AName;
            this.Gender = Gender;
            this.email = email;
        }
        
    }
    public static class book extends Author{
        String BName;
        double price;
        int Qnty;

        public book(String BName, double price, int Qnty, String AName, char Gender, String email) {
            super(AName, Gender, email);
            this.BName = BName;
            this.price = price;
            this.Qnty = Qnty;
        }

        public String getBName() {
            return BName;
        }

        public double getPrice() {
            return price;
        }

        public int getQnty() {
            return Qnty;
        }

        public String getAName() {
            return AName;
        }

        public char getGender() {
            return Gender;
        }

        public String getEmail() {
            return email;
        }

        public void setBName(String BName) {
            this.BName = BName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQnty(int Qnty) {
            this.Qnty = Qnty;
        }

        public void setAName(String AName) {
            this.AName = AName;
        }

        public void setGender(char Gender) {
            this.Gender = Gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }   
    }
    public static void main(String [] args){
        book b=new book("Data Science",120,3,"VASAN",'M',"vasan@gmail.com");
        System.out.println(b.getBName()+"\n"+b.getPrice()+"\n"+b.getQnty()+"\n"+b.getAName()+"\n"+b.getEmail()+"\n"+b.getGender());
        
    }
}
