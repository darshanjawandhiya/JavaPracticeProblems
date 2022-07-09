package patterns;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int n = (2*input)-1;
		int row = 1;
		int nst = n / 2;
		int nsp = 1;

		while (row <= n) {
			if (row == 1 || row == n) {
				int cst = 1;
				while (cst <= n) {
					System.out.print("*");
					cst++;
				}
			} else {
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;
				}

				// space
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp++;

				}
				// star
				cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;
				}
				// modification
				if (row <= n / 2) {
					nst--;
					nsp += 2;
				} else {
					nst++;
					nsp -= 2;
				}

			}
			System.out.println();
			row++;
		}

	}
}
