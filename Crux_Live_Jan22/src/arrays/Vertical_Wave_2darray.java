package arrays;

public class Vertical_Wave_2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 12, 13, 15 } }; // hard coded 2d array
		print(arr); // calling function print

	}

	private static void print(int arr[][]) {
		// TODO Auto-generated method stub
		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0) { // main logic

				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {

				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}
}
