package basicPrograms;

import java.util.Scanner;

public class LargestOf5No {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int largeNo = a;

		// logic
		for (int i = 1; i <5; i++) {
			if (b > largeNo) {
				largeNo = b;
			} 
			else if (c > largeNo) {
				largeNo = c;
			} 
			else if (d > largeNo) {
				largeNo = d;
			} 
			else if (e > largeNo) {
				largeNo = e;
			}
		}
		System.out.println(largeNo);

	}

}