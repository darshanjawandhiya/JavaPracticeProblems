package recursion;

public class Factorial2OfNo {
	//Tail recursion
	private static void factorial(int n,int ans) {
		//base case
		if(n==0||n==1) { //base case
			System.out.println(ans); //myWork
			return;
		}
		factorial(n-1, ans*n); //Recursive calls/statement
		//return; //every plate has to be removed.
		//khud lagao ya compiler laga dega.
	}

	public static void main(String[] args) {
		factorial(4, 1);
		
	}

}
