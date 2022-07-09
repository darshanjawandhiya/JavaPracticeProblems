package patterns;

import java.util.Scanner;

public class PatternwithZeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		
		while(row<=n) {
			int cst=1;
			while(cst<=row) {
				if(cst==1 || cst==row ) {
					System.out.print(row +"\t");
					cst++;					
				}else {
					System.out.print(0 +"\t");
					cst++;
				}
		
			}
			System.out.println();
			row++;
		}
	}

}
