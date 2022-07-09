package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		System.out.println(Search(arr, 8));

	}

	private static int Search(int arr[], int item) {
		int low = 0; // initial value of low
		int high = arr.length - 1; // initial value of high

		while (low <= high) { // base condn
			int mid = (low + high) / 2;

			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {// arr[mid]<item
				low = mid + 1;
			}
		}
		return -1; // if item is not present return -1

	}

}
