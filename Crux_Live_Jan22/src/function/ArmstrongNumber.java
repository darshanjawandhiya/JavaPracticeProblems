package function;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isArmstrongNumber(n));

	}

	private static boolean isArmstrongNumber(int n) {
		int d = countdigit(n);
		int ans = 0;
		int temp = n;

		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			ans += Math.pow(rem, d);
		}
		if (ans == temp) {
			return true;
		} else {
			return false;
		}
	}

	private static int countdigit(int n) {
		int c = 0;
		while (n > 0) {
			n /= 10;
			c++;

		}
		return c;

	}

}
