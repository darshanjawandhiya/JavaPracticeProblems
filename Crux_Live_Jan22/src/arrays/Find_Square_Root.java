package arrays;

import java.util.Scanner;

public class Find_Square_Root {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(squareroot(n)); //fun call

	}

	private static long squareroot(long n) {
		// Using binary search as search space is sorted
		long low = 0;  // 0 is also possible square root
		long high = n;
		long ans = 0;
		while (low <= high) { // base condn
			long mid = (low + high) / 2;
			if (mid * mid <= n) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;

	}

}
