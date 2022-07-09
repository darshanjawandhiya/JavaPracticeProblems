package basicPrograms;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n = 1;

		int count = 0;
		for (int i = 1; i <= n1; i++) {
			while (count < n1) {
				int num = (3 * n) + 2;
				n++;
				if (num % n2 != 0) {
					System.out.println(num);
					count++;
				} else {
					break;
				}

			}

		}
	}
}
