package loops;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		while(n>0)
		{
			int r=n%10;
			n/=10;//n=n/10
			System.out.println(r);
		}
		
		
	}

}
