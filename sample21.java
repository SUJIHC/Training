import java.util.*;
class sample21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]!=6 && arr[i]!=7){
				sum+=arr[i];
				}
		}
		System.out.println(sum);
		System.out.println(sum/n);
	}
}
