package arrays;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt(); // taking i/p in array
			}
		}
		Transpose(arr); //calling function
		
		//printing values
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(); //next line
		}

	}

	private static void Transpose(int arr[][]) {
		
		for (int row = 0; row < arr.length; row++) { // keeping row constant for each iteration
			
			for (int col = row + 1; col < arr.length; col++) { // col=row+1 imp step
				// swapping values
				int temp = arr[row][col];
				arr[row][col] = arr[col][row]; // most imp
				arr[col][row] = temp;
			}

		}

	}

}
