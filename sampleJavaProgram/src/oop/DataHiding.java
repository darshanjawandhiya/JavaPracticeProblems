package oop;

class Rectangles{
	private double len;
	private double bre;
	
	public double getLen()
	{
		return len;
	}
	public double getBre()
	{
		return bre;
	}
	public void setLen(double l)
	{
		if(l>=0)
		{
			len=l;
		}
		else
		{
			len=0;
		}
	}
	public void setBre(double b)
	{
		if(b>=0)
		{
			bre=b;
		}
		else
		{
			bre=0;
		}
		
	}
	
	public double area()
	{
		return len*bre; // or return getLen() * getBre();
	}
	public double perimeter()
	{
		return 2*(len+bre);
	}
	public boolean isSquare()
	{
		return len==bre;
	}
}

public class DataHiding {

	public static void main(String[] args) {
		Rectangles r=new Rectangles(); //object r of Rectangles created in heap
		
		r.setLen(10.5); //property method
		r.setBre(5.5); // property method
		
		System.out.println("Area: "+r.area());
		System.out.println("Perimeter: "+r.perimeter());
		System.out.println("isSquare: "+r.isSquare());
		
		System.out.println("Length: "+r.getLen());
		System.out.println("Breadth: "+r.getBre());
	}

}
