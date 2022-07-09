package arrays;

public class ReversingAnArray {
	private static void printReverse(int arr[], int n) {

		for (int curr = n - 1; curr >= 0; curr--) {
			System.out.print(arr[curr]+ " ");
		}
		System.out.println();
	}
	private static void printActualReverse(int arr[],int n) {
		int h1=0,h2=n-1;
		while(h1<h2) {
			//swapping
			int temp=arr[h1];
			arr[h1]=arr[h2];
			arr[h2]=temp;
			h1++;
			h2--;
		}
		for(int i=0;i<arr.length;i++) { //printing actual reversed array
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n=arr.length;
		printReverse(arr, n);
		printActualReverse(arr, n);
		
	}

}
