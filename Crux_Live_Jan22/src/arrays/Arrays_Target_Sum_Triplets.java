package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // taking i/p in arr
		}
		// taking target i/p
		int t = sc.nextInt();
		
		print(arr, t); //calling function

	}

	private static void print(int arr[], int t) {
		// TODO Auto-generated method stub
		Arrays.sort(arr); // sorting arr as we want o/p in ascending order

		// main logic comparison begins for finding triplets
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==t) {
						System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
						System.out.println(); //next line
					}
				}
			}
		}
	}

}
