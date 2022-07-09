package oop;

class Rectangle1
{
    public double length;
    public double breadth;
    
    public Rectangle1() //default or non-paramaterized constructor
    {
    	length =1 ;
    	breadth=1;
    }
    public Rectangle1(double l,double b) //paramaterized constructor
    {
    	setLen(l); 
    	setBre(b);
    }
    public Rectangle1(double s)
    {
    	length=breadth=s;
    }
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
        if(length==breadth)
            return true;
        else
            return false;
    }
    public double getLen()
	{
		return length;
	}
	public double getBre()
	{
		return breadth;
	}
	public void setLen(double l)
	{
		if(l>=0)
		{
			length=l;
		}
		else
		{
			length=0;
		}
	}
	public void setBre(double b)
	{
		if(b>=0)
		{
			breadth=b;
		}
		else
		{
			breadth=0;
		}
		
	}
    
}

public class Constructor {
	public static void main(String[] args) {
        Rectangle1 r=new Rectangle1(10,5);
        
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        
        System.out.println("Is it a Square: "+r.isSquare());
    }
    
}


