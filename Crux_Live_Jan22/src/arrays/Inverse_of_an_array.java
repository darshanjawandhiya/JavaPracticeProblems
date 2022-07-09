package arrays;

import java.util.Scanner;

public class Inverse_of_an_array {
	private static void Inverseofarray(int[] arr) {
		int val=0;
		int invArr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			val=arr[i];
			invArr[val]=i; //main logic
		}
		//printing no
		for(int i=0;i<arr.length;i++) {
			System.out.print(invArr[i]+ " ");
		}
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Inverseofarray(arr);
		

	}

}
