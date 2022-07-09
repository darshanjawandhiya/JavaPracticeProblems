package arrays;

public class Maximum_Subarray_leetcode {

	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxsum(arr)); // fun call maxsum
	}

	private static int maxsum(int arr[]) {
		int ans = Integer.MIN_VALUE; // initial value --> -2^31 (this handle edge case if array contains all negative
										// number i.e <0

		for (int i = 0; i < arr.length; i++) { // for each subarray index varies from i to n
			int previous_Sum = 0; // initial value
			for (int j = i; j < arr.length; j++) { // calc sum for each subarray and finding max sum
				previous_Sum += arr[j];
				ans = Math.max(ans, previous_Sum); // compare both and store max value

			}
		}
		return ans;
	}

}
