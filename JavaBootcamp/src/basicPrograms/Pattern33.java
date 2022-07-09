package basicPrograms;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) {
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// number
			int cst = 1;
			int count = n - row;
			while (cst <= nst) {
				if (cst == row) {
					System.out.print(0);
					cst++;
				} else if (cst < row) {
					System.out.print(++count);
					cst++;
				} else {
					System.out.print(count--);
					cst++;
				}

			}

			System.out.println();
			row++;
			nst += 2;
			nsp--;

		}

	}
}
