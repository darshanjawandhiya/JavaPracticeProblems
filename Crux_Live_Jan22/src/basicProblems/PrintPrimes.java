package basicProblems;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) { // check from 2 to n
			int fact = 0; // yaha galti karra tha mein -- take fact after first loop
			for (int j = 2; j <= n / 2; j++) { // checking no. with each factor till n/2 to reduce time complexity
				if (i % j == 0 && i != j) { // check if there is any factor apart from the no. itself
					fact++;
					break;
				}

			}
			if (fact != 1) {
				System.out.println(i);
			}

		}

	}

}
