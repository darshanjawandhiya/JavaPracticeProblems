package arrays;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Taking input
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col]; // new 2-d arr created in heap

		for (int i = 0; i < arr.length; i++) { // row
			for (int j = 0; j < arr[0].length; j++) { // col
				arr[i][j] = sc.nextInt(); // taking input of element in arr
			}
		}
		SpiralPrint(arr);
	}

	private static void SpiralPrint(int arr[][]) {
		// TODO Auto-generated method stub
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int total = arr.length * arr[0].length; // imp
		int count = 0;

		while (count < total) {
			// imp condn for every loop-- count<total (done to handle rectangular matrix
			// edge case)
			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.print(arr[minr][i] + ", ");
				count++;
			}
			minr++;

			for (int i = minr; i <= maxr && count < total; i++) {
				System.out.print(arr[i][maxc] + ", ");
				count++;
			}
			maxc--;

			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.print(arr[maxr][i] + ", ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < total; i--) {
				System.out.print(arr[i][minc] + ", ");
				count++;
			}
			minc++;
		}
		System.out.println("END");
	}

}
