package arrays;

import java.util.Scanner;

public class Print_Armstrong_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		PrintArmstrongNumber(n1, n2);

	}

	private static void PrintArmstrongNumber(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			int temp = i; // will be needed for in every iteration //mistake was here
			int noOfDigit = countDigit(temp); // catching value in noOfdigit
			int ans = 0;

			while (temp > 0) {
				int rem = temp % 10;
				ans += Math.pow(rem, noOfDigit);
				temp /= 10; // reducing number
			}
			if (ans == i) { // not checking with temp because temp will reduce to zero
							// for every iteration coz of line 24
				System.out.println(ans);
			}

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
