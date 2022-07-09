package recursion;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m=sc.nextInt(); //item whose first occ we have to find
		System.out.println(firstOcc(arr, 0, m));
		
	}
	private static int firstOcc(int arr[],int i,int item) {
		
		if(i==arr.length) { //base case 1 //always first check length
			return -1;
		}
		if(arr[i]==item) { //base case 2
			return i;
		}
		
		return firstOcc(arr, i+1, item); //recursive call

	}
	

}
