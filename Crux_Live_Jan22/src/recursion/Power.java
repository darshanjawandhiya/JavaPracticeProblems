package recursion;

public class Power {

	public static void main(String[] args) {
		int a=5; //base
		int b=4; //exponent
		System.out.println(pow(a,b));
	}
	private static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		int ans=pow(a,b-1);
		return ans*a;
	}
}
