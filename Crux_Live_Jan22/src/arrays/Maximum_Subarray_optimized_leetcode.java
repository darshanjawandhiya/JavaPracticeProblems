package arrays;

public class Maximum_Subarray_optimized_leetcode {

	public static void main(String[] args) {
		// Using kadance algorithm
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(Kadane(arr));
	}

	private static int Kadane(int arr[]) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE; //will keep track of maxsum
		int prev_sum = 0; //initial value

		for (int i = 0; i < arr.length; i++) { //iterate over array
			prev_sum += arr[i]; //adding element in prevSum
			ans = Math.max(prev_sum, ans); //comparing values as we want maxsum

			if (prev_sum < 0) {   //* Most Imp step --> kadane algorithm *
				prev_sum = 0;    //* Most Imp step --> kadane algorithm *
			}
		}
		return ans;
	}

}
