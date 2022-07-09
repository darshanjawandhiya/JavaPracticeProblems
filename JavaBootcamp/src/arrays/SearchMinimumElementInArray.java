package arrays;

public class SearchMinimumElementInArray {
	private static int minInArray(int[] arr) {
		int minValue = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minValue) {
				minIndex = index;
				minValue = arr[index];
			}
		}
		System.out.println("Minimum Index is: " + minIndex);
		return minValue;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 9 };
		int ans = minInArray(arr);
		System.out.println(ans);

	}

}
