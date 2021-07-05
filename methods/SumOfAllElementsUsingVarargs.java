package methods;

public class SumOfAllElementsUsingVarargs {
	
	static int sum(int ...x)
	{
		int sum=0; //initial value
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum of all elements is: "+sum(1,2,3,4,5,6,7,8,9,10));

	}

}
