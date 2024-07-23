import java.util.*;
class sample16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
       
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            
        }
       int search=sc.nextInt();
       int count =0;
        for(int i=0;i<size;i++)
        {
          if(arr[i]==search)
          {
              System.out.println("index "+i);
              count=1;
          }
        }
        if(count==0)
        {
            System.out.println(-1);
        }
        
    }
}