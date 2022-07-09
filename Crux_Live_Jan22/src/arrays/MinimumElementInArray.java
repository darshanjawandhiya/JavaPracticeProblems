package arrays;

public class MinimumElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, -3, 90, 7, -9, 79, -18, 902 };
		System.out.println(minElement(arr)w);

	}

	public static int minElement(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
