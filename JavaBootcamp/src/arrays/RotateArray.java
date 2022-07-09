package arrays;

public class RotateArray {
	private static void rotate(int arr[], int n, int k) {
		k = k % n; //this is optimization step

		for (int i = 0; i < k; i++) {
			// picking the element from last room
			int picked = arr[n - 1];

			// we are starting from n-2
			for (int curr = n - 2; curr >= 0; curr--) {
				arr[curr + 1] = arr[curr];
			}
			arr[0] = picked; // placing picked element at start (rotation)

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		rotate(arr, n, 3);

		for (int j = 0; j < arr.length; j++) { //printing rotated array
			System.out.print(arr[j] + " ");
		}

	}

}
