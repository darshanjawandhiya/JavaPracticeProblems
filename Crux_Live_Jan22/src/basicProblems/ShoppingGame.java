package basicProblems;

import java.util.Scanner;


public class ShoppingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int num = 1;
			while (m >= 0 && n >= 0) {
				m -= num;
				num++;
				n -= num;
				num++;
			}
			if (m < 0)
				System.out.println("Harshit");
			else
				System.out.println("Aayush");
		}
	}
}
