package arrays;

import java.util.Scanner;

public class Arrays_Linear_Search {

	private static int LinearSearch(int[] arr, int m) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == m) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // taking input
		}
		int m = sc.nextInt();
		System.out.println(LinearSearch(arr, m)); //passing arr[] address and no m. 
		

	}

}
