package loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int m =n; //temp will be needed to check if no. is armstrong no.
		int sum =0;
		
		while(n>0)
		{
			int r=n%10;
			n/=10;
			sum+=r*r*r;
			
		}
		if(sum==m)
		{
			System.out.println(m+ " is an Armstrong number");
		}
		else
		{
			System.out.println(m+ " is not an Armstrong number");
		}
	}

}


