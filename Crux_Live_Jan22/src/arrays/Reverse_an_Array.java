package arrays;

import java.util.Scanner;

public class Reverse_an_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // array of size n
		// Array input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Printing reverse array
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
