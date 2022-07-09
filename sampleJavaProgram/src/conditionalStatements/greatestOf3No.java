package conditionalStatements;

import java.util.Scanner;

public class greatestOf3No {

	public static void main(String[] args) {
		//using if-else ladder
		System.out.println("Enter 3 numbers:");
		Scanner sc=new Scanner(System.in); //taking input from user
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//code for greatest of 3 nos. using if-else ladder begins
		if(a>b && a>c)
		{
			System.out.println(a+ " is greater");
		}
		else if(b>c)
		{
			System.out.println(b+ " is greater");
		}
		else
			System.out.println(c+ " is greater");

	}

}
