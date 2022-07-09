package datatypesRelatedProblems;

import java.util.Scanner;

public class OddandEvenbackinDelhi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int evenSum = 0;
			int oddSum = 0;
			while (n > 0) {
				int digit = n % 10;
				if (digit % 2 == 0) {
					evenSum += digit;
				} else {
					oddSum += digit;
				}
				n /= 10;
			}
			// main condn

			if (evenSum % 4 == 0 || oddSum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}
}
