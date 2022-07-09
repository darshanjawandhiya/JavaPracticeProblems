package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ReversalAlgo_RotateArray_leetcode {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		RotateArray(arr, k);
		//printing rotated array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void RotateArray(int arr[], int k) {
		int n = arr.length;
		k %= n; // updating value of k;

		// Applying Reversal Algorithm
		Reverse_Array(arr, 0, n - k - 1);// first n-k element reverse
		Reverse_Array(arr, n - k, n - 1); // last k elements reverse
		Reverse_Array(arr, 0, n - 1); // Reverse entire array

	}

	private static void Reverse_Array(int arr[], int i, int j) {

		// logic
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			// two pointer approach
			i++;
			j--;
		}
	}
}
