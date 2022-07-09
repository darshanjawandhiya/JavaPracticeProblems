package recursion;

public class XPowerNTailRec {
	private static void power(int x, int n, int ans) {

		if (n == 0) { // base case
			System.out.println(ans); // myWork
			return;
		}
		power(x, n - 1, ans * x);// recursive call

	}

	public static void main(String[] args) {
		power(2, 3 , 1);

	}

}
