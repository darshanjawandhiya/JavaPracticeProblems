package arrays;

import java.util.Scanner;

public class Arrays_Insertion_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		// taking i/p for arr a
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Sort(a); // calling function
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); //printing sorted array
		}

	}

	private static void Sort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;   //imp
			int item = a[i]; //imp
			while (j >= 0 && a[j] > item) {
				a[j + 1] = a[j];
				j--;
			}
			j++;
			a[j] = item;

		}

	}

}
