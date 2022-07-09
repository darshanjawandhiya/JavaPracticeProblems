package basicProblems;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // no. of terms to print in series
		int n2 = sc.nextInt(); // should not be multiple of n2
		int count = 0; //to count no. of terms. once count==n1 while loop ends
		int n = 1; //counter to print diff. no. in series
		while (count != n1) {
			int s = 3 * n + 2;
			if (s % n2 != 0) {
				System.out.println(s); //printing no. in series which is not multiple of n2
				count++; //count increases
				n++; 
			}
			else {
				n++;
				
			}

		} //while ends as series of n1 is completed

	}

}
