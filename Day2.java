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
import static day2.patient.bmi;
import java.util.*;

class prime{ Scanner s=new Scanner(System.in);
    
    void seq(){
       
    int st=s.nextInt();
    int end=s.nextInt();
    for(int i=st;i<end;i++){
    int n=i,ct=0;
    for(int j=2;j<n/2;j++){
    if(n%j==0){
    ct++;break;
    }
    }
    if(ct>0){
//    System.out.println(i+": Not Prime");
    }
    else{
       System.out.println(i+": Prime");
       }
    }
}
    void add(){
    int n=s.nextInt();
    int sum=0;
    while(n>0){
    int rem=n%10;
    sum+=rem;
    n=n/10;
    }
    System.out.println(sum);
    }
    
    static int rev(int n){
 
    int rev=0;
    while(n>0){
    int rem=n%10;
    rev=rev*10+rem;
    n=n/10;
    }
    return rev;
    }
    void exe(){
        int i=0,ct=2;
    while(i<=5){
        if(ct%2==0 && ct%3==0 && ct%5==0){
        System.out.print(ct+" ");i++;ct++;
        }
        else{ct++;}
    }
    
    }
    void adam(){
    
    int i=s.nextInt();
    int rev=rev(i);
   
    int sq1=i*i;
    int sq2=rev*rev;
    int rev2=rev(sq2);
    
    if(sq1==rev2){System.out.print("Adm Number");}else{System.out.print("NOOOOO");}
    }
    void cap(){
    int i=s.nextInt();
    int sq=i*i;
    int d=10,ct=0;
    while(sq/d >0){
    int m=sq%d;
    int n=sq/d;
    if((m+n)==i){ct=1;break;}
    d=d*10;
    }
    if(ct==1){System.out.println("KApra");}
    else{System.out.println("NOt KApra");}
    
    }
    
    void rot(){
    int n=s.nextInt();
    int a[]=new int[n];
    int r=s.nextInt();
    List <Integer>li=new LinkedList<>();
    
    for(int i=0;i<n;i++){
    a[i]=s.nextInt();
    }
   int p = 1;
        while (p <= r) {
            int last = a[0];
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[n - 1] = last;
            p++;
        }
    System.out.print(Arrays.toString(a));
    }
    void Arr(){
        int n=s.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){a[i]=s.nextInt();sum+=a[i];}
    int avg=sum/n;
    Arrays.sort(a);
    System.out.print("sum:"+sum+" avg:"+avg);
    System.out.println("Max:"+a[n-1]+"Min:"+a[0]);
    
    }
    void ar2(){
    int n=s.nextInt();
    int a[]=new int[n];
    int k=s.nextInt();
    int flag=0;
    for(int i=0;i<n;i++){a[i]=s.nextInt();if(a[i]==k){flag=i;}}
    if(flag!=1){System.out.println("-1");}
    else{System.out.println(flag);}
    }
    void asc(){
     int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){a[i]=s.nextInt();}
    for(int i=0;i<n;i++){
        char c=(char)a[i];
        System.out.print(c);}
    }
    void str(){
    String st=s.nextLine();
    int r=s.nextInt();
    String a=st.substring(0,r);
    String b=st.substring(r)+a;
    System.out.println(b);
    }
}

class box{
    int width;
    int height;
    int depth;
box(int h,int w,int d){this.depth=d;
this.height=h;
this.width=w;

}
void vol(){
System.out.println(height*width*depth);
}
}
class Calc{
static int num1;
static int num2;
static double power(int n1,int n2){
    num1=n1;
    num2=n2;
return Math.pow(num1, num2);
}
}
class patient{
static double height;
static String name;
static double weight;
patient(String n){this.name=n;}
static double bmi(double h,double w){
    height=h;
    weight=w;
    double t=height/100;
    System.out.println(name);
return t*t+weight;
}
}

public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    prime p=new prime();
//    p.seq();
//p.rev();
//p.exe();
//p.adam();
//p.cap();
//p.rot();
//p.asc();
//p.str();
box b=new box(10,10,12);
b.vol();
Calc c=new Calc();
double a=c.power(10,2);
        System.out.println(a);
patient pa=new patient("Vasan");
System.out.println(bmi(170,55));
    }
}
