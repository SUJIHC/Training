import java.util.*;
class sample18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[1]+" min" );
         System.out.println(arr[n-2]+" "+arr[n-1]+" max" );
        
    }
}