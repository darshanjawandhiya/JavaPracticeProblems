package array;

import java.util.Scanner;

public class MultiplyingMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Matrix one
		System.out.println("Enter no. of rows and columns in matrix one:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int one[][]=new int[r1][c1]; //first matrix
		
		System.out.println("Enter elements in matrix one:");
		
		for(int i=0;i<one.length;i++) //rows
		{
			for(int j=0;j<one[0].length;j++) //columns
			{
				one[i][j]=sc.nextInt(); //storing elements in first matrix
			}
		}
		//Matrix two
		System.out.println("Enter no. of rows and columns in matrix two:");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int two[][]=new int[r2][c2]; //second matrix
		
		System.out.println("Enter elements in matrix two:");
		
		for(int i=0;i<two.length;i++) //rows
		{
			for(int j=0;j<two[0].length;j++) //columns
			{
				two[i][j]=sc.nextInt(); //storing elements in second matrix
			}
		}
		if(c1!=r2)
		{
			System.out.println("Invalid input");
			return;
		}
		//Resultant product matrix
		int product[][]=new int[r1][c2];
		for(int i=0;i<product.length;i++) //rows
		{
			for(int j=0;j<product[0].length;j++)//columns
			{
				for(int k=0;k<c1;k++) //or for(int k=0;k<r2;k++) as c1=r2
				{
					product[i][j]+=one[i][k] * two[k][j]; //filling product matrix
				}
			}
		}
		
		//Printing product matrix
		for(int i=0;i<product.length;i++)
		{
			for(int j=0;j<product[0].length;j++)
			{
				System.out.print(product[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
