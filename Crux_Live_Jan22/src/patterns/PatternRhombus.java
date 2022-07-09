package patterns;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n - 1;
		int nst = 1;
		int count = 1; //here i was going wrong
		int row = 1;
		while (row <= 2 * n - 1) {
			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst <= nst/2) {   //here i was going wrong
					System.out.print(count + "\t");
					count++;
					cst++;
				} else {
					System.out.print(count + "\t");
					count--;
					cst++;
				}
			}
			
			//modification
			if(row<n) {
				count+=2; //here i was going wrong
				nsp--;
				nst+=2;
			}else
			{
				nsp++;
				nst-=2;
				
			}
			System.out.println();
			row++;
		}

	}

}
