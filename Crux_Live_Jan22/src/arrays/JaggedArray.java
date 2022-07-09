package arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); // row
		int arr[][] = new int[r][]; // 2-d jagged array created

		// Taking input
		for (int i = 0; i < arr.length; i++) {
			int c = sc.nextInt(); // column
			arr[i] = new int[c]; // very imp step --jagged array column
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// Printing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // next line

		}
	}

}
