package arrays;

public class Main {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n));

	}
	private static int fact(int n) {
		// TODO Auto-generated method stub
		//base case
		if(n==0) {
			return 1;
		}
		int fn=fact(n-1);
		return fn*n;
	}

}
