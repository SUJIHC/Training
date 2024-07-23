import java.util.*;
class sample9{
	public static boolean isprime(int n){
		if(n==1){
			return false;
		}
		else{
			for(int i=2;i<=(n/2);i++){
				if(n%i==0){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
		if(isprime(i)){
			System.out.println(i+" Prime number");
			}
		else{
			System.out.println(i+" Not Prime number");
			}
		}
	}
}