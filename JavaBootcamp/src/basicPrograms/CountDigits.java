package basicPrograms;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		int count = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit == num)
				count++;
			n/=10;

		}
		System.out.println(count);
	}

}
