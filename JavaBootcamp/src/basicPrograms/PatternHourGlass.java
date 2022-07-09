package basicPrograms;

import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nr=2*n+1;
		int nsp=0;
		int nst=n;
		for(int row=1;row<=nr;row++) {
			//space
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("\t");
			}
			//no
			int count=nst;
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(count-- +"\t");
			}
			//0
			System.out.print(0+"\t");
			//no
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(cst+ "\t");
			}
			//Modification
			System.out.println();
			if(row<=(nr/2)) {
				nsp++;
				nst--;
			}else
			{
				nsp--;
				nst++;
			}
			
		}

	}

}
