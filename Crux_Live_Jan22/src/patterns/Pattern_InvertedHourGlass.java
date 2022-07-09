package patterns;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 1;
		while (row <= 2 * n + 1) {
			// num
			int cst = 1;
			int count = n;
			while (cst <= nst) {
				System.out.print(count + "\t");
				count--;
				cst++;
			}
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// num
			if (row == n + 1) { //edge case
				cst = 2;
				count+=2; //here i was making mistake
			} else {
				cst = 1;
				count++; // imp step
			}
			while (cst <= nst) {
				System.out.print(count + "\t");
				count++; // imp step
				cst++;
			}
			// modification
			if (row <= n) {
				nst++;
				nsp -= 2;

			} else {
				nst--;
				nsp += 2;

			}
			System.out.println();
			row++;
		}

	}

}
