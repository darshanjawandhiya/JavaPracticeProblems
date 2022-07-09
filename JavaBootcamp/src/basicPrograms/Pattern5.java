package basicPrograms;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int row=1;
		int nst=1;
		int nsp=n-1;
		//work 1 print spaces
		while(row<=n) {
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			//work 2 print stars
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			nst++;
			nsp--;
			System.out.println();
			row++;
		}

	}

}
