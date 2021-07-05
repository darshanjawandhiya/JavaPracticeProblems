package oop;

class cylinder1
{
	public double r; //radius
	public double h; //height
	
	public double lidArea()
	{
		return Math.PI*r*r;
	}
	public double totalSurfaceArea()
	{
		return 2*Math.PI*r*(r+h);
	}
	public double volume()
	{
		return Math.PI*r*r*h;
	}
	public double circumference()
	{
		return 2*Math.PI*r;
	}
}

public class cylinder {

	public static void main(String[] args) {
		
		cylinder1 c=new cylinder1(); //object c of cylinder1 created inside heap
		
		c.r=7;
		c.h=10;
		
		System.out.println("Lid Area: "+c.lidArea());
		System.out.println("Total Surface Area: "+c.totalSurfaceArea());
		System.out.println("Volume: "+c.volume());
		System.out.println("Circumference: "+c.circumference());
		

	}

}
