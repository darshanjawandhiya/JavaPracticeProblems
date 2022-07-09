package basicPrograms;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = 2*n-3;

		for (int row = 1; row <= n; row++) {
			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// star
			int cst = 1;
			if (row == n) {
				cst = 2;
			}
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep step
			System.out.println();
			nst = nst + 1;
			nsp -= 2;

		}

	}

}
