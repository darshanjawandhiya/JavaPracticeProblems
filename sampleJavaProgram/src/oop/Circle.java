package oop;

class circle1
{
	public double radius; //property
	
	public double area() //method
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;  
	}
	public double circumference()
	{
		return perimeter(); //perimeter=circumference both are same
	}
}

public class Circle {

	public static void main(String[] args) {
		
		circle1 c1=new circle1(); //object c1 of circle1 created in heap
		circle1 c2=new circle1(); //object c2 of circle1 created in heap
		
		c1.radius=7;
		c2.radius=14;
		
		
		System.out.println("Area1: "+c1.area());
		System.out.println("Perimeter1: "+c1.perimeter());
		System.out.println("Circumference1: "+c1.circumference());
		
		System.out.println("Area2: "+c2.area());
		System.out.println("Perimeter2: "+c2.perimeter());
		System.out.println("Circumference2 : "+c2.circumference());
		

	}

}
