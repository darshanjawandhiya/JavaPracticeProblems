package arrays;

public class SumOfAllSubarrays {
	private static void generateSubarray(int arr[], int n) {

		for (int si = 0; si < n; si++) { // si loop
			for (int ei = si; ei < n; ei++) { // ei loop
				int sum = 0; // initial value of sum for each subarray
				for (int k = si; k <= ei; k++) { // loop for printing each subarray

					sum += arr[k]; //sum = sum + arr[k] 

					System.out.print(arr[k] + " "); // prints subarray
				}
				System.out.println("Sum is : " + sum); //prints sum
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
