package array;

import java.util.Scanner;

public class InsertingAnElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		int n=6;
		System.out.println("Enter the index at which you want to insert element:");
		int index=sc.nextInt();
		System.out.println("Enter the element you want to insert :");
		int ele=sc.nextInt();
		
		for(int i=n;i>index;i--)
		{
			a[i]=a[i-1];
			 
		}
		a[index]=ele;
		System.out.println("Array after inserting element is:");
		for(int i=0;i<=n;i++)
		{
			System.out.print(a[i]+ ",");
		}

	}
	

}
