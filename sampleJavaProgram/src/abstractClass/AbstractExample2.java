package abstractClass;

abstract class Shape
{
	abstract public double perimeter();
	abstract public double area();	
}
class Circle extends Shape
{
	double radius;
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape
{
	double length,breadth;
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public double area()
	{
		return length*breadth;
	}
	
}


public class AbstractExample2 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(); 
		r.length=10.5;
		r.breadth=5.5;
		Shape s=r; //Dynamic method dispatch
	
		System.out.println("Area of rectangle: "+s.area());
		System.out.println("Perimeter of rectangle:"+s.perimeter());
	
		

	}

}
