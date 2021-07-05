package loops;

import java.util.Scanner;

public class ReversingANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n =sc.nextInt();
		String rev="";
		//code begins here
		while(n>0)
		{
			int r=n%10;
			n/=10;
			rev=rev+r;
		}
		System.out.println("Reverse of number is : " +rev);
		
	}

}
