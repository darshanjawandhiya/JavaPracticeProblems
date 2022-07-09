package recursion;

public class Factorial_Using_Head_Recursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));

	}

	private static int fact(int n) {

		if (n == 0) {
			return 1; // base case
		}
		int f = fact(n - 1); //smaller problem-> we want n! so ask recursion for (n-1)!
		return f * n; 
	}

}
