package basicPrograms;

import java.util.Scanner;

public class OddEvenInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int carNo = sc.nextInt();
			int sumOfDigitsEven=0;
			int sumOfDigitsOdd=0;
			// logic
			while(carNo > 0) {
				int rem = carNo % 10;
				//condition
				if(rem%2==0) {
					sumOfDigitsEven+=rem;
				}
				else
				{
					sumOfDigitsOdd+=rem;
				}
				carNo /= 10;

			}
			if(sumOfDigitsEven%4==0 || sumOfDigitsOdd%3==0)
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
