import java.util.*;
class sample7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(((ch <='z') && (ch >='a'))){
				System.out.println((char)(ch-32));
		}
		else if((ch>='A') && (ch<='Z')){
			System.out.println((char)(ch+32));
		}
		else{
			System.out.println("not a character");
		}
	}
}