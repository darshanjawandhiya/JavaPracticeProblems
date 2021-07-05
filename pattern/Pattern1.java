package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int counter = 0;
			while (counter < n) {
				System.out.print("*" + " ");
				counter++;
			}
			System.out.println();

		}

	}
}
