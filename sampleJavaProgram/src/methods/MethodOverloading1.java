package methods;

public class MethodOverloading1 {
//To calculate area
	static double area(double l,double b)
	{
		return l*b; //rectangle
	}
	static double area(double r)
	{
		return Math.PI*r*r; //circle
	}
	static double area(double l,double b,double h)
	{
		return 0.5*(l+b)*h; //trapezium
	}
		
	
	public static void main(String[] args) {
		System.out.println(area(2,3,4));

	}

}
