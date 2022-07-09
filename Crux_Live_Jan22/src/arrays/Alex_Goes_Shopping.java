package arrays;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // no of items in shop
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // taking price of each item as i/p
		}
		int q = sc.nextInt(); // no of queries

		while (q-- > 0) {
			int a = sc.nextInt(); // money alex has
			int k = sc.nextInt(); // no of choice shopkeeper has
			
			int count=0; //initial val of count
			// loop on i/p array
			for (int i = 0; i < arr.length; i++) {
				// checking if Alex will invest money on the item
				if(a%arr[i]==0) {
					count++;
				}
			}
			if(count>=k) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
