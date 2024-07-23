import java.util.*;
class sample5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(((ch <='z') && (ch >='a'))||((ch>='A') && (ch<='Z'))){
				System.out.println(ch+" is alphabet");
		}
		else if((ch<='9') && (ch>='0')){
			System.out.println(ch+" is number");
		}
		else{
			System.out.println(ch+" is special character");
		}
	}
}