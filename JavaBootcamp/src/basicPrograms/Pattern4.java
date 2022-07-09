package basicPrograms;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt(); 
		int rowNum = 1;
		while (rowNum <= noOfRows) {
			int cst = 1;
			while (cst <= rowNum) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			rowNum++;

		}

	}
}
