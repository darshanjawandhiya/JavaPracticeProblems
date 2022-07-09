package recursion;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m=sc.nextInt(); //item whose last occ we have to find
		System.out.println(LastOcc(arr, arr.length-1, m));
		
	}

	private static int LastOcc(int arr[], int i, int item) {

		if (i < 0) { // base case 1 //always first check length
			return -1;
		}
		if (arr[i] == item) { // base case 2
			return i;
		}

		return LastOcc(arr, i - 1, item); // recursive call

	}

}
