package arrays;

public class Product_Of_Array_Except_Self_leetcode {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 4 };
		int ans[] = product(arr); //function call
		for (int i = 0; i < ans.length; i++) { //printing updated array stored/catched in ans[]
			System.out.print(ans[i] + " ");

		}

	}

	private static int[] product(int arr[]) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];

		left[0] = 1; //ini left arr 0th pos with 1 

		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1]; //imo condn
		}

		right[n - 1] = 1; //ini. right arr n-1 pos with 1

		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1]; //imp condn
		}

		for (int i = 0; i < n; i++) {
			arr[i] = left[i] * right[i]; //updating array with product of array except self to get req. result
		}

		return arr;

	}
}
