package datatypesRelatedProblems;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int n = ch;

		if (n >= 97 && n <= 122) {
			System.out.println("lowercase");
		} 
		else if (n >= 65 && n <= 90) {
			System.out.println("UPPERCASE");

		}else
			System.out.println("Invalid");

	}
}
