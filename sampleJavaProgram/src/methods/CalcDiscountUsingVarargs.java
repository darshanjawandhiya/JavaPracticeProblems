package methods;

public class CalcDiscountUsingVarargs {
	static double discount(double ...ds)
	{
		double sum =0; //initial value
		//calculating sum
		for(int i=0;i<ds.length;i++)
		{
			sum+=ds[i];
		}
		//calculating discount
		if(sum<500)
		{
			return sum*0.05; //5%
		}
		else if(sum>500 && sum<1000)
		{
			return sum*0.1; //10%
		}
		else if(sum>1000)
		{
			return sum*0.2; //20%
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		
		System.out.println("Discount is:"+discount(200,120,500));
		

	}

}
