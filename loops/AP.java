package loops;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter starting value:");
			int s=sc.nextInt();//starting element
			System.out.println("Enter common difference:");
			int cd=sc.nextInt();//common difference
			System.out.println("Enter how many terms you want in AP :");//no. of elements in AP
			int n=sc.nextInt();
			
			
			
			for(int i =0;i<n;i++)
			{
				System.out.print(s+","); //printing AP till i<n
				s+=cd; 
			}
		}
	}

}
