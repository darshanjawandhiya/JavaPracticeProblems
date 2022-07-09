package patterns;

import java.util.Scanner;

public class Pattern_NumberLadder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int count=1;
		while(row<=n) {
			int cst=1;
			while(cst<=row) {
				System.out.print(count+"\t");
				count++;
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
