package recursion;

public class Print_Dec {

	public static void main(String[] args) {
		int n = 5;

		dec(n); //function call

	}

	private static void dec(int n) {
		if (n == 0) { //base case
			return;
		}
		System.out.println(n); // print 5 rest recursion will do (smaller prob)
		dec(n - 1); //bigger prob solved using recursion

	}

}
