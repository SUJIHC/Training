import java.util.*;
class sample10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		while(n>0){
			int i=n%10;
			n=n/10;
			sum+=i;
		}
		System.out.println(sum);
	}
}