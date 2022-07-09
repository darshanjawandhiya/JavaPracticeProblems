package basicPrograms;

import java.util.Scanner;

public class OddAndEvenInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumOfDigits = 0;
		for (int i = 1; i <= n; i++) {
			int carNo = sc.nextInt();
			// logic
			while(carNo > 0) {
				sumOfDigits += carNo % 10;
				carNo /= 10;

			}
			if(sumOfDigits%4==0)
			{
				System.out.println("Yes");
			}
			else if(sumOfDigits%3==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			

		}

	}
}
