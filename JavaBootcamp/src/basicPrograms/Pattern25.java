package basicPrograms;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int count=1;
		for (int row = 1; row <= n; row++) {
			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// no
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(count+ "\t");
				count++;
			}
			// prep step
			System.out.println(); // next line
			nsp--;
			nst += 2;

		}

	}
}