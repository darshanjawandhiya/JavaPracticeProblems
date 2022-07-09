package oop;

class Rect
	{
		public double length;
		public double breadth;
		
		public double area()
		{
			return length*breadth;
		}
		public double perimeter()
		{
			return 2*(length+breadth);
		}
		public boolean isSquare()
		{			
			return length==breadth;
		}
	}

	public class Rectangle {

	public static void main(String[] args) 
	{
		
		Rect r=new Rect(); //object r of Rect created in heap
		r.length=10.5;
		r.breadth=5.5  ;
		
		System.out.println("Area: "+r.area());
		System.out.println("Perimeter: "+r.perimeter());
		System.out.println("Is it a Square: "+r.isSquare());		

	}

}
