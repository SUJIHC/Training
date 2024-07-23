import java.util.*;
class sample11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		while(n>0){
			int i=n%10;
			n=n/10;
			str+=String.valueOf(i);
		}
		System.out.println(str);
	}
}