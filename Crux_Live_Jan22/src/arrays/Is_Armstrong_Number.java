package arrays;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrongNumber(n));

	}

	private static boolean IsArmstrongNumber(int n) {
		int noOfDigit = countDigit(n); // catching value in noOfdigit
		int ans = 0;
		int temp = n; // will be needed at end
		while (n > 0) {
			int rem = n % 10;
			ans += Math.pow(rem, noOfDigit);
			n /= 10; // reducing number
		}
		if (ans == temp) {
			return true;
		} else {
			return false;
		}

	}

	private static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;// reducing num
			count++;// increasing count by 1
		}
		return count;

	}

}
