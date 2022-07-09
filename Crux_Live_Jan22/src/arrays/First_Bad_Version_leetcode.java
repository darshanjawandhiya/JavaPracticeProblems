package arrays;

public class First_Bad_Version_leetcode {

	public static void main(String[] args) {
		System.out.println(isBadVersion(24));
	}

	private static int badVersion(int n) {
		int low = 1;
		int high = n;
		int ans = 0;

		while (low <= high) {
			int mid = low+(high-low) / 2; //imp condn to handle tle due to large constraints in question

			if (isBadVersion(mid) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;

		// this code is for leetcode

	}

	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
