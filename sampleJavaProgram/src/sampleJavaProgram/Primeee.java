package sampleJavaProgram;

import java.util.Scanner;

public class Primeee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;

		int counter = 2;

		while (counter != n - 1) {
			if (n % counter == 0)
				flag = false;
				
			counter++;
		}

		if (flag == true) {
			System.out.println("Is Prime");
		} else
			System.out.println("Is not Prime");

	}

}
