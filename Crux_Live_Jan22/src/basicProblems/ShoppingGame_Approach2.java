package basicProblems;

import java.util.Scanner;

public class ShoppingGame_Approach2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // no. of test cases

		while (t-- > 0) { // for multiple test case input
			int m = sc.nextInt(); // Aayush
			int n = sc.nextInt(); // Harshit
			int Aayush_total_phone = 0;
			int Harshit_total_phone = 0;
			int curr = 1;
			while (true) { // first chance is of Aayush
				Aayush_total_phone += curr;

				if (Aayush_total_phone > m) { // checking if it exceeds than what is stated by Aayush
					System.out.println("Harshit");
					break;

				}
				curr++; // increase curr by 1
				Harshit_total_phone += curr;
				if (Harshit_total_phone > n) {
					System.out.println("Aayush");
					break;
				}
				curr++; // increase curr by 1
			}

		}
	}
}
