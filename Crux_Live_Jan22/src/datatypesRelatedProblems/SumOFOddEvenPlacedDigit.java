package datatypesRelatedProblems;

import java.util.Scanner;

public class SumOFOddEvenPlacedDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cst=1;
		int even=0;
		int odd=0;
		while(n>0) {
			int digit=n%10;
			if(cst%2==0) {
				even+=digit;
				cst++;
				
			}else {
				odd+=digit;
				cst++;
			}
			n/=10;
			
		}
		System.out.println(odd);
		System.out.println(even);

	}

}
