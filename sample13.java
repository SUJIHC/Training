import java.util.*;
class sample13{
	static boolean iskaprekar(int n) 
	{ 
		if (n == 1) 
		return true; 
		int sq = n * n,div=1;   
		while( sq/div>0)
		{  
			int lef=sq/div;
			int rig=sq% div; 
			if (rig!=0 && (lef+rig) == n) 
			return true;
		div*=10;
		} 
		return false; 
	} 
	public static void main (String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		System.out.println(iskaprekar(n) ? "Yes": "No"); 
	} 
}