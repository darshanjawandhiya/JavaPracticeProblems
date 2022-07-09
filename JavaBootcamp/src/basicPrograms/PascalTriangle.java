package basicPrograms;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) { // loop for rows
			for (int j = 0; j <= i; j++) { // loop for printing no
				PascalTriangle obj = new PascalTriangle();
				System.out.print(obj.coeff(i, j) + "\t");
			}
			System.out.println();

		}

	}

	int coeff(int n, int r) { // function to calc binomial coeffs
		int c = fact(n) / (fact(r) * fact(n - r));
		return c;
	}

	int fact(int n) // function for factorial
	{
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}

}
