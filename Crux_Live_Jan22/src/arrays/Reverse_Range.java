package arrays;

import java.util.Scanner;

public class Reverse_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 23, 4, 5, 67, 89, 10, 12, 90, 78, 8, -1, 24 };
		int i = sc.nextInt(); // range i
		int j = sc.nextInt(); // to range j
		Reverse_Array(arr, i, j);
		// printing values of Reversed array
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

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
