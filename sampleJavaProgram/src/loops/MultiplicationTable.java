package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = sc.nextInt();
		
		System.out.println("Multiplication table of "+n+" is printed below :");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
			 
		}
	}

}
