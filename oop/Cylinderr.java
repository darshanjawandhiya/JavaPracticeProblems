package oop;

class Cylinderr1 {
	private double radius;
	private double height;
	
	public double getRadius() 
	{
		return radius;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setRadius(double r) 
	{
		if(r>=0)
			radius=r;
		else
			radius=0;
	}
	public void setHeight(double h) 
	{
		if(h>=0)
			height=h;
		else
			height=0;
	}
	public void setDimensions(double r,double h)
	{
		setHeight(h);
		setRadius(r);
	}
	
	//Methods
	public double area()
	{
	  return Math.PI*radius*radius;
	}
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}	
		
		
		//Constructors
		public Cylinderr1()
		{
			height=0;
			radius=0;
		}
		public Cylinderr1(double r)
		{
			radius=r;
			height=1;
		}
		public Cylinderr1(double r,double h)
		{
			setHeight(h);
			setRadius(r);
		}
	}


	public class Cylinderr{
	public static void main(String[] args) {
		Cylinderr1 c=new Cylinderr1(5.2,10.3);
		
		System.out.println("Area: "+c.area());
		System.out.println("Volume:"+c.volume());
	}

}
