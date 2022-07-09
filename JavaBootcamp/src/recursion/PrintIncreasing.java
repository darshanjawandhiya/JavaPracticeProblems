package recursion;

public class PrintIncreasing {
	private static void printInc(int n) {
		// Using Head Recursion ->(In this case RECURSION is KING (RAJA))
		// base case
		if (n == 0) {
			return;
		}
		// recursive call
		printInc(n - 1);

		// myWork
		System.out.println(n);

		// return; //you do it or compiler will do it automatically

	}

	public static void main(String[] args) {
		printInc(5);
		

	}

}
