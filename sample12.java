import java.util.*;
class sample12{
	public static String rev(int a){
		String str="";
		int n=a;
		while(n>0){
			int i=n%10;
			n=n/10;
			str+=String.valueOf(i);
		}
		return str;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=Integer.parseInt(rev(n));
		int nsqr=n*n;
		int bsqr=b*b;
		int res=Integer.parseInt(rev(bsqr));
		System.out.println(res==nsqr ? "Adam number" : "Not Adam number");
	}
}