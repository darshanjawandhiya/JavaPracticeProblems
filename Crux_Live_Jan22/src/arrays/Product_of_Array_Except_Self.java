package arrays;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of array
		long arr[] = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		long ans[] = Product(arr); // catching arr values in ans
		for (int i = 0; i < ans.length; i++) { //printing updated array
			System.out.print(ans[i] + " ");
		}
	}

	private static long[] Product(long arr[]) {
		int n = arr.length;
		long left[] = new long[n];
		long right[] = new long[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1]; // imp
		}
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1]; // imp
		}
		for (int i = 0; i < n; i++) {
			arr[i] =left[i] * right[i]; // imp
		}
		return arr; // imp arr is returned becoz values are updated in arr (see step 30)

	}

}
