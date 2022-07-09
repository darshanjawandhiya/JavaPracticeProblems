package patterns;

import java.util.Scanner;

public class Pattern_DoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int nspa = -1;
		int count=1;
		while (row <= n) {
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			// num
			int cst = 1;
			if(row<=n/2+1) {
				count = row;				
			}else {
				count-=2; //here i was going wrong.
			}
			
			while (cst <= nst) {
				System.out.print(count + "\t");
				count--;
				cst++;
			}
			// space
			int cspa = 1;
			while (cspa <= nspa) {
				System.out.print(" \t");
				cspa++;
			}
			// num
			cst = 1;
			count = 1;
			if (row == 1 || row == n) {
				cst = 2;
			}

			while (cst <= nst) {
				System.out.print(count + "\t");
				count++;
				cst++;
			}

			// modification
			if (row <= n / 2) {
				nsp -= 2;
				nst++;
				nspa+=2;
			} else {
				nsp += 2;
				nst--;
				nspa-=2;

			}
			System.out.println();
			row++;
		}
	}

}
