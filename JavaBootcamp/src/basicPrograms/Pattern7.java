package basicPrograms;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(count +"\t");
				count++;
			}
			System.out.println();
			
		}

	}

}
