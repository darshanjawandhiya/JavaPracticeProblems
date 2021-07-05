package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) // row
		{
			for (int j = 1; j <= n - i; j++) { // work to be done (spaces)
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) { // preparation (print *)
				System.out.print("* ");

			}
			System.out.println();
		}

	}
}