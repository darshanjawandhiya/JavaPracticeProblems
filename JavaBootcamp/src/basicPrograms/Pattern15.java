package basicPrograms;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nr=2*n-1;
		int nst=n;
		int nsp=0;
		for(int row=1;row<=nr;row++) {
			//space
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("\t");
			}
			//star
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*\t");
			}
			
			//prep step
			System.out.println();
			if(row<n) {
			nst=nst-1;
			nsp=nsp+2; 
		}else
		{
			nst=nst+1;
			nsp=nsp-2;
		}
		}

	}

}
