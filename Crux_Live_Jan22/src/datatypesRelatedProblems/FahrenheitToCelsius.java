package datatypesRelatedProblems;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();
		for (int f = min; f <= max; f += step) {
			int c = (int) ((5.0 / 9) * (f - 32));
			System.out.println(f + "\t" + c);
		}

	}

}
