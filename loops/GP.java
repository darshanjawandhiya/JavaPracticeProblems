package loops;

import java.util.Scanner;

public class GP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value:");
		int s=sc.nextInt();//starting element
		System.out.println("Enter common ratio:");
		int cr=sc.nextInt();//common ratio
		System.out.println("Enter how many terms you want in GP :");//no. of elements in GP
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print(s+",");
			s*=cr; //printing GP series till i<n
		}
		
	}

}
