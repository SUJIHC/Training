import java.util.*;
class sample20
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
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j] && i!=j){
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				System.out.print(arr[i]+" ");
				}
		}
        
    }
}