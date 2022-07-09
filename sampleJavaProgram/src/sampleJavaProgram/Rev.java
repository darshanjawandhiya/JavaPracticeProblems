package sampleJavaProgram;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0; // initial value

		while (n != 0) {
			int rem = n % 10;
			n /= 10; // prepare no. n for next iteration
			rev = rev * 10 + rem;

		}
		System.out.println("Reverse of no : " + rev);
	}

}
