package conditionalStatements;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any year to check if it is a leap year: ");
		int year =sc.nextInt();
		//leap year code logic starts here
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year +" is a leap year");
				}
				else
				{
					System.out.println(year +" is not a leap year");
				}
			}
			else
			{
				System.out.println(year +" is a leap year");
			}
		}
		else
		{
			System.out.println(year +" is not a leap year");
		}
	}
}
		


