package arrays;

public class SearchingAnElementInArray {
	private static int searchElement(int[] arr, int search) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == search) {
				return index;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 9 };
		int ans = searchElement(arr, 3);
		System.out.println(ans);

	}

}
