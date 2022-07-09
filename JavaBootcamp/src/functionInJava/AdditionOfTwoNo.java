package functionInJava;

public class AdditionOfTwoNo {

	public static void main(String[] args) {
		System.out.println("Hello");
		addition(); //function call
		additionParams(10, 20);
		additionParams(30, 20);
		int sum=additionReturn(30, 40);
		System.out.println(sum);
		System.out.println("Bye");

	}

	private static void additionParams(int a, int b) { // function defination
		int sum = a + b;
		System.out.println(sum);

	}
	private static int additionReturn(int a,int b) {
		int sum =a+b;
		return sum;

	}

	private static void addition() { // function defination
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println(c);

	}

}
