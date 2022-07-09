package methods;

import java.util.Scanner;

public class GcdOfTwoNumbers {
	static int gcd(int m,int n)
	{
		while(m!=n)
		{
			if(m>n)
			{
				m-=n;
			}
			else
			{
				n-=m;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("GCD of "+x+ " and "+y+ " is "+gcd(x, y));
		

	}

}
