package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 9, 2, 5, 8, 7 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int smallest=i;                  //picking smallest elements
			for(int j=i+1;j<arr.length;j++) {
				 if(arr[smallest]>arr[j] ) {
					  smallest=j; 
				 }
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			

		}
		System.out.println();
	}

}
