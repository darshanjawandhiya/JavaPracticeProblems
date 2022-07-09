package array;

import java.util.Scanner;

public class DeletingAnEle {

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
		System.out.println("Enter the index at which you want to delete element:");
		int index=sc.nextInt();
		for(int i=index;i<n-1;i++)
		{
			a[i]=a[i+1];
			
			//System.out.print(a[i]); Just for my reference (to see how values are being swapped)
			 
		}
		System.out.println();
		System.out.println("Array after deleting element is:");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+ " ");
		}


	}

}
