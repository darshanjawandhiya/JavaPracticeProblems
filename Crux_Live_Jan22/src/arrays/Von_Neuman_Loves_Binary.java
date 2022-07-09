package arrays;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
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

}
