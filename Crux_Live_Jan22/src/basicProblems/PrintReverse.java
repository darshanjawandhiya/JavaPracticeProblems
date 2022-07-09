package basicProblems;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // input
		int rev = 0;
		while (n > 0) {
			int digit = n % 10; // getting each digit from last to form reverse no.
			rev = rev * 10 + digit; // calculating reverse no.
			n /= 10; // reducing no for next iteration
		}
		System.out.println(rev);

	}

}
