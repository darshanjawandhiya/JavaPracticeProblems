package recursion;

public class PrintDecreasingIncreasing {
	private static void PDI(int n) { // combining tail and head recursion
		if (n == 0) { // base case
			return;
		}
		System.out.println(n); // myWork
		PDI(n - 1); // recursive call
		System.out.println(n); // myWork

	}

	public static void main(String[] args) {
		PDI(5);

	}

}
