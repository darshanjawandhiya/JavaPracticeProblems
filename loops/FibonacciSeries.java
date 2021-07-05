package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Series");
		System.out.println("Enter no. of elements you want in Fibonacci series:");
		int n=sc.nextInt();
		
		int a=0;//starting element
		int b=1;//second element
		System.out.print(a+",");
		System.out.print(b+",");
		
		for(int i=0;i<n-2;i++)
		{
			int c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
