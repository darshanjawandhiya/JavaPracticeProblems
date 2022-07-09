package datatypesRelatedProblems;

import java.util.Scanner;

public class DecimalToOctal {
	private static int DeciToOctal(int dec) {
		int octalNo=0;
		int count=1;
		while(dec>0) {
			int rem=dec%8;
			octalNo+=rem*count;
			count*=10;
			dec/=8;
		}
		return octalNo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		System.out.println(DeciToOctal(dec));
	}

}
