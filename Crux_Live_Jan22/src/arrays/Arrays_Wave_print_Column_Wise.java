package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays_Wave_print_Column_Wise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // row
		int n = sc.nextInt(); // col
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printWave(arr);

	}

	private static void printWave(int arr[][]) {
		for (int col = 0; col < arr[0].length; col++) {//arr[0].length -->the number of columns on row 0
			if (col % 2 == 0) { // even
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + ", ");
				}
			} else { //odd
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}
		System.out.print("END");

	}

}
