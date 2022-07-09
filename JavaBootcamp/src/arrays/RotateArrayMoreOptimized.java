package arrays;

public class RotateArrayMoreOptimized {
	private static void printActualReversee(int arr[], int start, int n) {
		int h1 = start, h2 = n - 1;
		while (h1 < h2) {
			// swapping
			int temp = arr[h1];
			arr[h1] = arr[h2];
			arr[h2] = temp;
			h1++;
			h2--;
		}
	}

	private static void rotate(int arr[], int n, int k) {
		//first optimization step
			k = k % n;
		//second optimization step
		printActualReversee(arr, 0, n); // 1. whole array reverse
		printActualReversee(arr, 0, k); // 2. first k elements reverse
		printActualReversee(arr, k, n); // 3. last n-k elements reverse
		
	}
	

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		rotate(arr, n, 3); //calling rotate function
		for(int i=0;i<n;i++) { //printing rotated array
			System.out.print(arr[i]+ " ");
		}

	}

}
