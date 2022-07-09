package patterns;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(); //5
		int row = 1;
		int nsp = n - 1;
		int nst = 1;

		// space
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// star
			int cst = 1;
			while (cst <= n) {
				if(cst == 1 || cst == n || row == 1 || row == n) {
					System.out.print("*");
					cst++;
				}else {
					System.out.print(" ");
					cst++;
				}
			}
			// modification
			row++;
			System.out.println();
			nsp--;

		}

	}
}
