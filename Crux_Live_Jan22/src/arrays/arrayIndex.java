package arrays;

import java.util.Scanner;

public class arrayIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 3, 4, 9, 13, 7, 8 };
		int n = sc.nextInt(); // value you want to search in array
		System.out.println(returnIndex(n, arr));

	}

	private static int returnIndex(int n, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		} 
		return -1; // check entire array and if not present then return -1
	}
}
