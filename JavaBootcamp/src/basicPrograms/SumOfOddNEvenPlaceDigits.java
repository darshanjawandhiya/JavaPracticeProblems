package basicPrograms;

import java.util.Scanner;

public class SumOfOddNEvenPlaceDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sumOdd=0;
		int sumEven=0;
		int count=0;
		while(n>0) {
			int digit=n%10; //store digit
			n/=10;			//digit elimination
			count++; 		
			
			if(count%2==0) {
				sumEven+=digit;
			}
			else {
				sumOdd+=digit;
			}
			
			
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);

	}

}
