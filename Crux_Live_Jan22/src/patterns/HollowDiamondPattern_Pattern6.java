package patterns;

import java.util.Scanner;

public class HollowDiamondPattern_Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // input
		int row = 1;
		int nst = n/2+1;
		int nsp = -1; //important

		while (row <= n) {
			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// star
			cst = 1;
			if(row==1||row==n)
				cst=2;
			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}

			// modification
			if (row <= n / 2) { //here i was going wrong
				nst--;
				nsp += 2;

			} else {
				nst++;
				nsp -= 2;

			}
			System.out.println();
			row++;

		}
	}
}
