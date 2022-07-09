package arrays;

public class GeneratingAllSubarrays {
	private static void generateSubarray(int arr[], int n) {

		for (int si = 0; si < n; si++) { // si loop
			for (int ei = si; ei < n; ei++) { // ei loop
				for (int k = si; k <= ei; k++) { // loop for printing each subarray
					System.out.print(arr[k] + " "); // prints subarray
				}
				System.out.println(); // next line

			}

		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		generateSubarray(arr, n);

	}

}
