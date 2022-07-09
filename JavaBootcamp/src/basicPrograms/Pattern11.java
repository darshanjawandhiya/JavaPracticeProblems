package basicPrograms;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		for(int row=1;row<=n;row++) {
			for(int cst=1;cst<=nst;cst++)
			{
				if(row==1 || cst==1 || row==n ||cst==n ) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
			System.out.println();

	}

}
}
