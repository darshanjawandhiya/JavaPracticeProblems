package functionInJava;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int snum=sc.nextInt();
		int sb=sc.nextInt();
		int res=Conversion(snum, sb); //catching result in res variable
		System.out.println(res);
		
		

	}
	private static int Conversion(int snum,int sb) { //source num & source base
		int ans=0;
		int multiplier=1;
		while(snum!=0) {
			int rem=snum%10; //find remainder
			ans=ans+(rem*multiplier);
			multiplier*=sb; //upgrade multiplier with sb
			snum/=10; // upgrade snum
			
			
		}
		return ans;
		 

	}

}
