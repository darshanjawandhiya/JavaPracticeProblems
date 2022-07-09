package arrays;
import java.util.Scanner;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // n size arr created
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxsum(arr));

	}

	private static int maxsum(int arr[]) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int prevSum = 0; // initial val

		for(int i = 0; i < arr.length; i++) {
			prevSum += arr[i];
			ans = Math.max(ans, prevSum);

			if (prevSum < 0) {
				prevSum = 0;
			}

		}
		return ans;
	}
}
