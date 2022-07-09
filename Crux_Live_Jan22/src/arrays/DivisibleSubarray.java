package arrays;

import java.util.Scanner;

public class DivisibleSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no of test cases

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(GoodSubArray(arr));
		}

	}

	private static long GoodSubArray(int arr[]) {
		// TODO Auto-generated method stub
		int n = arr.length;
		long freq[] = new long[n];
		int sum = 0;
		freq[0] = 1;
		for (int i = 0; i < freq.length; i++) {
			sum += arr[i];
			sum = sum % n;
			if(sum<0) {
				sum+=n;
			}
			freq[sum] = freq[sum]+1;
		}
		long ans = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 2) {
				ans = ans + (freq[i] * (freq[i] - 1)) / 2;
			}

		}
		return ans;
	}

}
