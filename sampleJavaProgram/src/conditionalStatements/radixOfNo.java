package conditionalStatements;

import java.util.Scanner;

public class radixOfNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		String no=sc.nextLine();
		
		if(no.matches("[01]+"))
		{
			System.out.println("Binary Number--Radix=2");
		}
		else if(no.matches("[0-7]+"))
		{
			System.out.println("Octal Number--Radix=8");
		}
		else if(no.matches("[0-9]+"))
		{
			System.out.println("Decimal Number--Radix=10");
		}
		else if(no.matches("[0-9A-F]+"))
		{
			System.out.println("Hexadecimal Number--Radix=16");
		}
		else
			System.out.println("Not a number");

	}

}
