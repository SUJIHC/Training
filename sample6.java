import java.util.*;
class sample6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char gen=sc.next().charAt(0);
		int ag=sc.nextInt();
		if(gen=='f'){
			if(ag>=1 && ag<=58){		
				System.out.println("8.2 % interest");
			}
			else if (ag>=59 && ag<=100){
				System.out.println("9.2 % interest");
			}
		}
		else if(gen=='m'){
			if(ag>=1 && ag<=58){
				System.out.println("8.4 % interest");
			}
			else if(ag>=59 && ag<=100){
				System.out.println("10.5 % interest");
			}
		}
		else{
			System.out.println("Gender not valid");
		}
	}
}