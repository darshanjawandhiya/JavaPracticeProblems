package basicPrograms;

import java.util.Scanner;

public class PrintCummulativeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		do {
			int n=sc.nextInt();
			sum+=n;
			if(sum<0)
				break;
			else
				System.out.println(n);
		}while(sum>=0);

	}

}
