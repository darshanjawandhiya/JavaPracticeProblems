package patterns;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int count = n;
		int scount = n; //start counter for every row starting
		int nst = n;
		int nsp = 0;
		while (row <= 2 * n + 1) {
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// no
			int cst = 1;
			count = scount; // start counter for every row
			while (cst <= nst) {
				System.out.print(count + "\t");
				cst++;
				count--;
			}
			// 0
			System.out.print(0 + "\t");

			// no
			cst = 1;
			count = 1;
			if (row != n + 1) { // edge case
				while (cst <= nst) {
					System.out.print(count + "\t");
					count++;
					cst++;

				}
			}
			// modification
			if (row <= n) {
				nsp++;
				nst--;
				scount--;
			} else {
				nsp--;
				nst++;
				scount++;
			}

			System.out.println();
			row++;

		}

	}
}
