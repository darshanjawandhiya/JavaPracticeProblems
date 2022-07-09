package datatypesRelatedProblems;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			mul = mul * 2;
			n /= 10;
		}
		System.out.println(ans);

	}

}
