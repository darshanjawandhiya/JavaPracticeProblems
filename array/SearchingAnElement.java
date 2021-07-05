package array;

import java.util.Scanner;

public class SearchingAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,3,5,7,9,2,4,6,8};
		System.out.println("Enter the element you are searching for:");
		int n=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("Element " +n +" found at index "+i);
				System.exit(0);
			}
		}
				System.out.println("Element " +n +" not found");

	}

}
