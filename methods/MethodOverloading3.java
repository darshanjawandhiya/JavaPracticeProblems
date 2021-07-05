package methods;

public class MethodOverloading3 {

	static boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+"); // \\s refers to space. + means atleast one char should be present in string.   
	}
	static boolean validate(int age)
	{
		return age>=3 && age<=15 ;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(validate("Darshan"));
		System.out.println(validate(15));
	}

}
