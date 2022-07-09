package function;

public class Function_Demo {

	public static void main(String[] args) {
		System.out.println("hey");
		addTwoNumber();  //function call -->non-paramaterized function
		System.out.println("bye");
	}
	public static void addTwoNumber() {
		int a=9;
		int b=11;
		int c=a+b;
		System.out.println(c);
	}

}
