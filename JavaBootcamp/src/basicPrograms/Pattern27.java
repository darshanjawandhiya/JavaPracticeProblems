package basicPrograms;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int nst=1;
		int nsp=n-1;
		
		for(int row=1;row<=n;row++) {
			int count=1;
		
			//space
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
				
			}
			//star
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(count);
				if(cst<=(nst/2)) {
					count++;
				}
				else {
					count--;
				}
				
			}
			//prep step
			System.out.println();
			nst=nst+2;
			nsp=nsp-1;
			
			
		}

}
}
