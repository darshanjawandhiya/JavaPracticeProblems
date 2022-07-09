package basicPrograms;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int invNum=0;
		//logic
		int place=1;
		while(num>0)
		{
			int digit=num%10;
//			System.out.println(place+ " "+digit); //Printing Actual place digit table
			int invPlace=digit;
			int invDigit=place;
			invNum+=invDigit*Math.pow(10, invPlace-1);
			System.out.println(invPlace+ " "+invDigit); //Printing Inverse place digit table
			num/=10; //reducing number
			place++; //incrementing place
		}
		
		
		
		System.out.println("Inverse Number is:"+invNum);

	}

}
