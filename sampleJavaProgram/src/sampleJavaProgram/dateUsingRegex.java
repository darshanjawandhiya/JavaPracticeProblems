package sampleJavaProgram;

public class dateUsingRegex {

	public static void main(String[] args) {
		String date="19/09/2001";
		System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

	}

}
