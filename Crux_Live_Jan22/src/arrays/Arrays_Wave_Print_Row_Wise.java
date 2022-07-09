package arrays;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col]; // new 2-d arr created in heap

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt(); // taking input of element in arr
			}
		}
		SpiralPrint(arr); // calling func

	}

	private static void SpiralPrint(int arr[][]) {
		// TODO Auto-generated method stub
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int total = arr.length * arr[0].length; // row*col
		int count = 0; // intial val of counter

		while (count < total) { // base condn
			if(minr%2==0) { //imp
				for (int i = minc; i <= maxc && count < total; i++) {
					System.out.print(arr[minr][i] + ", ");
					count++;
				}
				minr++;
			}
			else {
				for (int i = maxc; i >= minc && count < total; i--) {
					System.out.print(arr[minr][i] + ", ");
					count++;
				}
				minr++;
			}
			
		}
		System.out.print("END");

	}

}
