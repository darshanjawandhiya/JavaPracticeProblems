package arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i]; // current element
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			// placement
			arr[j + 1] = current;
		}

	}
}
