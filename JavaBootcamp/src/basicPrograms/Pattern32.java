package basicPrograms;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nr = 2 * n - 1;
		int nst = 1;
		int val;
		for (int row = 1; row <= nr; row++) {
			if(row<=nr/2+1) {
				 val=row;
			}else {
				 val=nr-row+1;
			}
			// star
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(val);
				}
			}
			// prep step
			if (row <= nr / 2) {
				nst += 2;

			} else {
				nst -= 2;
			}
			System.out.println();

		}

	}

}
