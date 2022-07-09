package arrays;

import java.util.Scanner;

public class Matrix_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < arr.length; i++) { // loop for row
			for (int j = 0; j < arr[0].length; j++) { // loop for col
				arr[i][j] = sc.nextInt(); // taking i/p in 2-d arr
			}
		}
		int x = sc.nextInt(); // element to be searched
		System.out.println(search(arr, x)); // func call
	}

	private static int search(int arr[][], int x) {
		// TODO Auto-generated method stub
		// initial values
		int row = 0;
		int col = arr[0].length - 1;

		while (row < arr.length && col >= 0) { // base condn

			if (arr[row][col] == x) {
				return 1;
			} else if (arr[row][col] < x) {
				row++;
			} else {
				col--;
			}
		}
		return 0;

	}
}
