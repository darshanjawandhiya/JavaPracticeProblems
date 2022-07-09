package patterns;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n + 1;
		while (row <= n) {
			// num
			int cst = 1;
			int count = 1;
			while (cst <= nst) {
				System.out.print(count + "\t");
				count++;
				cst++;
			}
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// num
			cst = 1;
			if (row == n) { // edge case
				cst = 2;
				count--;
			}
			while (cst <= nst) {
				count--; //here i was going wrong
				System.out.print(count + "\t");
				cst++;
			}
			// modification
			nst++;
			nsp -= 2;
			System.out.println();
			row++;
		}

	}

}
