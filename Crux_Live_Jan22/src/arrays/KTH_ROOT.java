package arrays;

import java.util.Scanner;

public class KTH_ROOT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no. of test cases
		while (t-- > 0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			System.out.println(root(n, k));
		}

	}

	private static long root(long n, int k) {
		long lo = 1;
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = lo + (hi - lo) / 2;

			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo=mid+1;
			}
			else
			{
				hi=mid-1;
			}
		}
		return ans;

	}

}
