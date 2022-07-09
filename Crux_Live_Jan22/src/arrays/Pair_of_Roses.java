package arrays;

import java.util.*;

public class Pair_of_Roses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no. of test cases
		while (t-- > 0) {
			int n = sc.nextInt(); // no. of available roses
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int m = sc.nextInt(); // money available with deepak

			// func call
			pairOfRoses(arr, m);

		}
	}

	private static void pairOfRoses(int arr[], int m) {
		int p1 = 0; // initial value of 1st rose
		int p2 = 0; // initial value of 2nd rose
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // Here i was making mistake //imp j=i=1 and not j=1
				if ((arr[i] + arr[j] == m) && Math.abs(arr[j] - arr[i]) < diff) {

					p1 = arr[i];
					p2 = arr[j];
					diff = Math.abs(arr[j] - arr[i]);

				}

			}
		}
		display(Math.min(p1, p2), Math.max(p1, p2));

	}

	private static void display(int p1, int p2) {
		System.out.println("Deepak should buy roses whose prices are " + p1 + " and " + p2 + ".");

	}
}
