package basicProblems;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum = n;
		System.out.println(n);
		while (sum >= 0) {
			n = sc.nextInt();
			sum += n;
			if (sum >= 0) {
				System.out.println(n);
			} else {
				break;
			}

		}

	}

}
