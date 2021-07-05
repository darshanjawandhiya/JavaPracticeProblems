package methods;

public class MaxNumberUsingVarargs {

	static int max(int ...x)
	{
		if(x.length==0)
			return Integer.MIN_VALUE; //no element
		int max =x[0]; //only one element 
	
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
				max=x[i];
		}
		return max;
	}
	public static void main(String[] args) {
		
		System.out .println(max());
		System.out .println(max(10));
		System.out .println(max(10,20));
		System.out .println(max(10,20,30));
		

	}

}
