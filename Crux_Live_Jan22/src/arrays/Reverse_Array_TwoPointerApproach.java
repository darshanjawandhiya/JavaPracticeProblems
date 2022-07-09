package arrays;

import java.util.Iterator;

public class Reverse_Array_TwoPointerApproach {

	public static void main(String[] args) {
		int arr[] = { 23, 4, 5, 67, 89, 10, 12 };
		Reverse_Array(arr); 
		//printing values of Reversed array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static void Reverse_Array(int arr[]) {
		int i = 0; // pointer 1
		int j = arr.length - 1; // pointer 2

		// logic
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			//two pointer approach
			i++;
			j--;
		}
	}

}
