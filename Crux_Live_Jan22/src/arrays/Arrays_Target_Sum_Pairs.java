package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // array of size n
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // putting values
		}
		//Arrays.sort(arr);
		int target = sc.nextInt(); // taking target number as input
		printAllPairs(arr, target);

	}

	private static void printAllPairs(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // j=i+1 and not j=1->Here I was making mistake
				if (arr[i] + arr[j] == target) {
					if (arr[i] < arr[j]) {
						System.out.print(arr[i] + " and " + arr[j]);
						System.out.println();
					} else {
						System.out.print(arr[j] + " and " + arr[i]);
						System.out.println();
					}
				}
			}

		}

	}
}
