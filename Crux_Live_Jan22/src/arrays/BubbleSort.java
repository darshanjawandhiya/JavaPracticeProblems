package arrays;

import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 7, 9, 4 };
		sort(arr); // calling sort function
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {// outer loop for traversing
			for (int j = 0; j < arr.length - 1 - i; j++) {// inner loop for comparison
				if (arr[j] > arr[j + 1]) { // condn for swap of elements
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
