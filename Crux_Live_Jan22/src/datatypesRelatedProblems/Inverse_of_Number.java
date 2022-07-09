package datatypesRelatedProblems;

import java.util.Scanner;

public class Inverse_of_Number {
	public static int InverseofNumber(int n) {
		int count = 1;
		int inverseNum = 0;
		while (n > 0) {
			int digit = n % 10;
			inverseNum += (count * (Math.pow(10, digit-1)));
			
			count++;
			n /= 10; // reducing digit
			

		}
		return inverseNum;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(InverseofNumber(n));
		
	}
}
