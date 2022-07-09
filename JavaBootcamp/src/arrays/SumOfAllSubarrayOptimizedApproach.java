package arrays;

public class SumOfAllSubarrayOptimizedApproach {
	private static void generateSubarray(int arr[], int n) {
		int maxSum = Integer.MIN_VALUE;

		for (int si = 0; si < n; si++) {
			int sum = 0; // for every subarray calculation intial sum value=0
			for (int ei = si; ei < n; ei++) {
				sum = sum + arr[ei]; // calculating sum for each sub array
				if (sum > maxSum) {
					maxSum = sum;
				}
				System.out.println(si + " " + ei + " " + sum);

			}

		}
		System.out.println("Max Sum is: "+maxSum);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		generateSubarray(arr, n);

	}

}
