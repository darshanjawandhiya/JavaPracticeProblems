package methods;

public class MethodOverloading2 {
	//for reversing a number
	
	static int reverse(int n) 
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10; //next digit
		}
		return rev;
	}
		
	//for reversing an array  
	
	static int[] reverse(int A[])
	{
		int B[]=new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
			return B; //return any variable declared as array either A or B in this case as return type is int[] 
			
	}
	
	

	public static void main(String[] args) {
		
		int A[]={1,3,5,7,9,2,4,6,8,10};
		
		reverse(A); //reversing array
		System.out.println("Reverse of number is: " +reverse(2234)); //reversing no.
		
		

	}

}
