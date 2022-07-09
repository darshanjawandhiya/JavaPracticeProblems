package recursion;

public class XPowerN {
	private static int power(int x,int n) { //Head Recursion
		if(n==0) {
			return 1; //edge case
		}
		if (n==1) {	//base case
			return x;
		}
		int recAns=power(x,n-1);  //recursive call
		int meraAns= x * recAns; //myWork
		return meraAns;
	}

	public static void main(String[] args) {
		System.out.println(power(2, 3));
		
		
		

	}

}
