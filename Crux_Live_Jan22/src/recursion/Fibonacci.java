package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fib(n)); //calling function
		

	}
	private static int fib(int n) {
		if(n==0||n==1) { //base case
			return n;
		}
		int f1=fib(n-1); //n-1th term
		int f2=fib(n-2); //n-2th term
		return f1+f2;
	}

}
