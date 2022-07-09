package basicPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		int bin=sc.nextInt();
		int multiplier=1;
		int dec=0;
		while(bin>0) {
			int rem=bin%10;
			int value=multiplier*rem;
			dec+=value;
			bin/=10;
			multiplier*=2;
			
			
		}
		System.out.println(dec);

	}

}
}
