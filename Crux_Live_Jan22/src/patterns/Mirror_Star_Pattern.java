package patterns;

import java.util.Scanner;

public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n / 2;

		while (row <= n) {
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}
			// modification
			if (row <= n / 2) {
				nst += 2;
				nsp--;

			} else {
				nst -= 2;
				nsp++;

			}
			System.out.println();
			row++;

		}

	}

}
