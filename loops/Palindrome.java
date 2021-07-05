package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n =sc.nextInt();
		int rev=0;
		int m=n; //this value will be required at the end
		//code begins here
		while(n>0)
		{
			int r=n%10;
			n/=10;
			rev=rev*10+r;
		}
		if(m==rev)
		{
			System.out.println(m+ " is a palindrome");
		}
		else
		{
			System.out.println(m+ " is not a palindrome");
		}
	}

}
