package conditionalStatements;

import java.util.Scanner;

public class MenuDrivenProgramForArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		System.out.println("--MENU DRIVEN PROGRAM--");
		System.out.println("=====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		System.out.println("Enter option you need to perform in WORDS :");
		
		String option=sc.nextLine();
		option=option.toUpperCase();
		
		switch(option)
		{
		case "ADD" : System.out.println("Addition is: " +(a+b) );
					break;
		case "SUB" : System.out.println("Subtraction is " +(a-b) );
					break;
		case "MUL" : System.out.println("Multiplication is " +(a*b) );
					break;
		case "DIV" : System.out.println("Division is " +(float)(a/b) );
					break;
		default : System.out.println("Invalid Entry.Try Again!");
					
		}
	}

}
