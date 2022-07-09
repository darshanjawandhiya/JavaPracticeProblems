package recursion;

public class Factorial_Using_Tail_Recursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n, 1));//function call

	}

	private static int fact(int n, int ans) {
		if (n == 0) { // base case
			return ans;
		}
		return fact(n - 1, ans * n); // tail recursion

	}
}
