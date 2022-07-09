package datatypesRelatedProblems;

import java.util.Scanner;

public class ChewbaccaAndNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long mul = 1; // imp
		while (n > 9) // imp    
		{
			int rem = (int) (n % 10);
			if (rem >= 5) {        //or condn can be while(9-rem>rem)
				int t = 9 - rem;
				ans = ans + t * mul;

			} else {
				ans = ans + rem * mul;
			}
			mul = mul * 10;
			n /= 10;

		}
		if (n == 9) {
			ans = ans + n * mul;
		}else {
			if (n >= 5) {
				int t = (int) (9 - n);
				ans = ans + t * mul;

			} else {
				ans = ans + n * mul;
			}
		}
		System.out.println(ans);

	}

}
