package recursion;

public class PrintDecreasing {
	private static void printDec(int n) {
		// Using Tail Recursion  ->(In this case RECURSION is TAIL (POOCH))
		if (n == 0) { // base case
			return;
		}
		System.out.println(n);// myWork
		printDec(n - 1);// Recursive call
		//return; //you do it or compiler will do it

	}

	public static void main(String[] args) {
		printDec(5);

	}

}
