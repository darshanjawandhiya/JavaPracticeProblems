package basicPrograms;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n / 2;
		
		for(int row=1;row<=n;row++) {
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			// prep step
			System.out.println();
			if (row <= n / 2) {
				nst = nst + 2;
				nsp = nsp - 1;

			} else {
				nst = nst - 2;
				nsp = nsp + 1;

			}
		}
	}

}
