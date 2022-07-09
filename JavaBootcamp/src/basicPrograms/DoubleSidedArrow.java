package basicPrograms;

import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nstb = 1;
		int nspb = n - 1;
		int nsta = 1;
		int nspa = -1;
		for (int row = 1; row <= n; row++) {
			// space before
			for (int csp = 1; csp <= nspb; csp++) {
				System.out.print("\t");
			}
			//no before
			int count=0;
			if(row<=n/2) {
				count=row;
			}else {
				count=n-row+1;
			}
			for(int cst=1;cst<=nstb;cst++) {
				System.out.print(count+"\t");
				count--;
			}
			//space after
			for(int csp=1;csp<=nspa;csp++) {
				System.out.print("\t");
			}
			//no after
			int cst = 1;
            count++;
            if (row == 1 || row == n) { //to handle 1 row and n row
                cst = 2;
            }

			for(;cst<=nsta;cst++) {
				System.out.print(count+ "\t");
				count++;
			}
			System.out.println();
			if (row <= n / 2) {
				nspb = nspb - 2;
				nstb = nstb + 1;
				nspa = nspa + 2;
				nsta = nsta + 1;
			} else {
				nspb = nspb + 2;
				nstb = nstb - 1;
				nspa = nspa - 2;
				nsta = nsta - 1;

			}
		}
	}
}
