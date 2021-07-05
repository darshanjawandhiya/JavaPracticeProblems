package methods;

import java.util.Scanner;

public class PrimeNo 
	{
		static boolean isPrime(int n)
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int x=sc.nextInt();
		
		if(isPrime(x))
		{
			System.out.println(x+ " is Prime");
		}
		else
		{
			System.out.println(x+ " is not Prime");
		}
	}

}
