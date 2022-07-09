package arrays;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(sumOfDigit(n)==PrintBostonNumber(n)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		//System.out.println(PrintBostonNumber(n));

	}

	private static int PrintBostonNumber(int n) {
		int sumOfDigit = sumOfDigit(n);
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				sum += sumOfDigit(i); //not understood this step
				n /= i;               //not understood this step

			}
		}
		return sum;
	}

	private static int sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}
		return sum;
	}

}
