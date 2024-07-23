import java.util.*;
class sample8{
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
		if(isprime(n)){
			System.out.println("Prime number");
			}
		else{
			System.out.println("Not Prime number");
			}
	}
}