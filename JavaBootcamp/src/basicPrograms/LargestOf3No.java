package basicPrograms;

import java.util.Scanner;

public class LargestOf3No {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		// logic
		if(a>b) {
			if(a>c)
				System.out.println(a);
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		}

	}
