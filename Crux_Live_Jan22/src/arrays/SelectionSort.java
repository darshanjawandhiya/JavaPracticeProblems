package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int min_idx = i; // value of min index

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) { // imp condn to select minimum element
					min_idx = j;
				}
			}
			// swapping values of elements
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}

	}

}
