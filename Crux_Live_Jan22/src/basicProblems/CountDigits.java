package basicProblems;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // number
		int digit = sc.nextInt(); // digit
		int count = 0;

		while (num > 0) {
			int n = num % 10;
			if (n == digit) {
				count++;

			}
			num/=10;
		}
		System.out.println(count);

	}

}
