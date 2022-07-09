package arrays;

import java.util.Scanner;

public class Sorting_In_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // n size arr created

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();// taking n i/p
		}
		sortColors(arr); // calling func

		// printing values
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void sortColors(int arr[]) {
		// initial values
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int temp;

		while (mid <= high) { // imp condn
			// Three Pointer approach (DNF)

			if (arr[mid] == 0) { // 1
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			}

			else if (arr[mid] == 1) { // 2
				mid++;

			}

			else if (arr[mid] == 2) { // 3
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				//mid++; //here i was making mistake
				high--;
			}

		}

	}
}
