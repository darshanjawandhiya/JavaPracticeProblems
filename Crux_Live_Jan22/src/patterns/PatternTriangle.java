package patterns;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) { // outer loop
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// number
			int count = row;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(count + "\t");
			if (cst < row) {
				count++;
				cst++;
			} else {
				count--;
				cst++;
			}
		}
			// modification
			row++;
			nsp--;
			nst += 2;
			System.out.println();

		}
	}

}
