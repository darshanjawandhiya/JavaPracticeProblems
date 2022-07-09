package arrays;

import java.util.Scanner;

public class Product_Of_Array_Except_Self_Approach2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		long[] lft_arr = new long[n];
		long[] rgt_arr = new long[n];
		leftArrayProduct(lft_arr, n, arr);
		rightArrayProduct(rgt_arr, n, arr);
		for (int i = 0; i < n; i++) {
			arr[i] = lft_arr[i] * rgt_arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void leftArrayProduct(long[] lft_arr, int n, long[] arr) {
		lft_arr[0] = 1;
		for (int i = 1; i < n; i++) {
			lft_arr[i] = lft_arr[i - 1] * arr[i - 1];
		}
	}

	public static void rightArrayProduct(long[] rgt_arr, int n, long[] arr) {
		rgt_arr[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			rgt_arr[i] = rgt_arr[i + 1] * arr[i + 1];
		}
	}
}
