package conditionalStatements;

import java.util.Scanner;

public class gradeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects: ");
		
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int total=m1+m2+m3;
		float avg=(m1+m2+m3)/3;
		
		System.out.println("Total :"+total);
		System.out.println("Average :"+avg);
		//Grade calc logic
		if(avg>=70)
		{
			System.out.println("Grade obtained is A");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("Grade obtained is B");
		}
		else if(avg>=50 && avg<60)
		{
			System.out.println("Grade obtained is C");
		}
		else if(avg>=40 && avg<50)
		{
			System.out.println("Grade obtained is D");
		}
		else if(avg>=30 && avg<40)
		{
			System.out.println("Grade obtained is E");
		}
		else
			System.out.println("Grade obtained is F");
	}

}
