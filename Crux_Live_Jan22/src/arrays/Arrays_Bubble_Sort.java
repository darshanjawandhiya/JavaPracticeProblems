package arrays;

import java.util.Scanner;

public class Arrays_Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}
	private static void bubbleSort(int arr[]) {
		
		for(int pass=1;pass<arr.length;pass++) { //loop for no of iteration/terms(for n elements loop is running n-1 times
			for(int i=0;i<arr.length-pass;i++) {
				if(arr[i]>arr[i+1]) {
					//swap
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}

	}

}
