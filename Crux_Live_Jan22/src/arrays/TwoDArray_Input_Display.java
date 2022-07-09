package arrays;

import java.util.Scanner;

public class TwoDArray_Input_Display {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // row
		int m = sc.nextInt(); // column
		int arr[][] = new int[n][m];

		// Taking input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//Printing 2-D array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(); //next line
		}

	}

}
