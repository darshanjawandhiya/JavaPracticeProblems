package arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		// declare an array
		int arr[] = null;
		System.out.println(arr);

		// allocating space
		arr = new int[5];
		System.out.println("Memory Address of array:" + arr);
		System.out.println("Length of array:" + arr.length);

		// get values
		System.out.println("Default value of array elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// set values
		System.out.println("Setting value of array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.print(arr[i] + " ");
		}

	}

}
