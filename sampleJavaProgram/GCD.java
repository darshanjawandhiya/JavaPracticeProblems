package sampleJavaProgram;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend=sc.nextInt();
		int divisor=sc.nextInt();
		
		//logic begins
		
		while(dividend%divisor!=0)
		{
			int rem= dividend%divisor;
			dividend=divisor; //new dividend is old divisor
			divisor=rem; //new divisor is new remainder
			
					
		}
		System.out.println("HCF or GCD is:"+divisor);

	}

}
