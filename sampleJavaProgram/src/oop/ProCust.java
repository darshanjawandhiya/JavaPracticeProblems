package oop;

class Product{
	private String itemno,name;
	private double price;
	private int quantity;
	
	//Methods
	public String getItemNo()
	{
		return itemno;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(int qty)
    {
        quantity=qty;
    }
	//Constructors
	
	public Product(String itemNo)
    {
        itemno=itemNo;
    }
	
    public Product(String itemNo,String name)
    {
        itemno=itemNo;
        this.name=name;
    }
    public Product(String itemNo,String name,double price,int qty)
    {
        itemno=itemNo;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
	
}

class Customer{
	private String custId;
    private String name;
    private String address;
    private String phno;
    
    //Constructors
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }
    //Methods Getters and Setters
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}



public class ProCust {

	public static void main(String[] args) {
		
		Product p=new Product("121-wtch", "Fossil Men's Watch",1890.25,53);
		Customer c=new Customer("100","Darshan","Nagpur","9999999999");
		
		System.out.println("Product Info:");
		System.out.println("Item No: "+p.getItemNo());
		System.out.println("Item Name: "+p.getName());
		System.out.println("Item Price: "+p.getPrice());
		System.out.println("Item Quantity: "+p.getQuantity());
		
		System.out.println("Customer Info:");
		System.out.println("Customer ID: "+c.getCustId());
		System.out.println("Customer Name: "+c.getName());
		System.out.println("Customer Address: "+c.getAddress());
		System.out.println("Customer Mobile No: "+c.getPhno());
		
	}

}
