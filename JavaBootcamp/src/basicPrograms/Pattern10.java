package basicPrograms;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nr=2*n-1;
		int nst=1;
		for(int row=1;row<=nr;row++) {
			//work
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			
			if(row<=nr/2) {
				nst++;
			}else {
				nst--;
			}
		}
		 
		

	}

}
