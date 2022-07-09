package patterns;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int nst=0;
		while(row<n) {
			int cst=0;
			int ncr=1;
			while(cst<=nst) {
				System.out.print(ncr +"\t");
				ncr=((row-cst)*ncr)/(cst+1);
				cst++;
			}
			//modification
			nst++;
			System.out.println();
			row++;
		}
	}

}
