package basicPrograms;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int dn = getValueInBase(n, b);
		int sum=0;
		//System.out.println(dn);
		//sum of digit logic
		while(dn>0) {
			int dig=dn%10;
			dn/=10;
			sum+=dig;
		}
		System.out.println(sum);
			

	}

	public static int getValueInBase(int n, int b) {
		int rv = 0;
		int p = 1;
		while (n > 0) {
			int digit = n % b;
			n = n / b;
			rv += digit * p;
			p = p * 10;
		}
		return rv;

	}

}
