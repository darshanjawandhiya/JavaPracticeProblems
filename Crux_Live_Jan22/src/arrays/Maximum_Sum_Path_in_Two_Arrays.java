package arrays;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr1[] = new int[n];
			int arr2[] = new int[m];

			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			System.out.println(pathSum(arr1, arr2));
		}
	}

	private static int pathSum(int arr1[], int arr2[]) {
		// TODO Auto-generated method stub
		int i = 0; // arr1 track
		int j = 0; // arr2 track
		int p = 0; // arr1 start index
		int q = 0; // arr2 start index
		int ans = 0;// stores total sum
		while (i < arr1.length && j < arr2.length) { // base condn
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				int sum1 = 0;
				int sum2 = 0;

				// calc sum from p to i
				for (int k = p; k <= i; k++) {
					sum1 += arr1[k];
				}
				for (int k = q; k <= j; k++) {
					sum2 += arr2[k];
				}
				ans = ans + Math.max(sum1, sum2);
				// updating values
				i++;
				j++;
				p = i;
				q = j;
			}
		}
		if (i == arr1.length) {
			for (int k = q; k < arr2.length; k++) {
				ans += arr2[k];
			}
		}
		if (j == arr2.length) {
			for (int k = p; k < arr1.length; k++) {
				ans += arr1[k];

			}

		}
		return ans;
	}
}
