package recursion;
//head recursion
public class FactorialOfNo {
	private static int factorial(int n) {
		//Base case
		if(n==0||n==1) {
			return 1;
		}
		//Recursive calls (faith)
		int recAns=factorial(n-1);
		//My Work
		int myAns=recAns*n;
		return myAns;

	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		

	}

}
