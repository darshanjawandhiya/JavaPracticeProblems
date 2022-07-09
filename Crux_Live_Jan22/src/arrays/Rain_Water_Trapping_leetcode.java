package arrays;

public class Rain_Water_Trapping_leetcode {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(RainWaterTrap(arr));

	}

	private static int RainWaterTrap(int arr[]) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];

		// condn for left arr
		left[0] = arr[0]; // initial value

		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]); // calc max for left[i]
		}

		right[n - 1] = arr[n - 1]; // initial value

		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]); // calc max for right[i]
		}
		
		//calc ans
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			int min=Math.min(left[i],right[i]);
			ans=ans+(min-arr[i]); //min val - length of each bar
		}
		return ans;
		

	}

}
