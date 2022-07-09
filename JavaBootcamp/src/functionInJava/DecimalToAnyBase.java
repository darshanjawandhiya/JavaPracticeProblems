package functionInJava;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int snum = sc.nextInt();
		int db = sc.nextInt();
		int res = Conversion(snum, db); // catching result in res variable
		System.out.println(res);

	}

	private static int Conversion(int snum, int db) { // source num & source base
		int ans = 0;
		int multiplier = 1;
		while (snum != 0) {
			int rem = snum % db; // find remainder
			ans = ans + (rem * multiplier);
			multiplier *= 10; // upgrade multiplier with sb
			snum /= db; // upgrade snum

		}
		return ans;

	}
}
