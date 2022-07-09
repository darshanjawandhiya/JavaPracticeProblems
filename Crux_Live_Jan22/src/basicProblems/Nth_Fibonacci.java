package basicProblems;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0; // first num
		int b = 1; // second num
		int c = a + b; // third num
		int fib = c;
		for (int i = 0; i < n - 2; i++) { // i<n-2 as a=0 and b=1 are the first 2 terms of fibonacci series
			c = a + b;
			a = b;
			b = c;

			fib += a;
		}
		System.out.println(fib);

	}

}
