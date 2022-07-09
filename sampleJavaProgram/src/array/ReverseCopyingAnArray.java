package array;

public class ReverseCopyingAnArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,10,1,3,5,7,9};
		int b[]=new int[a.length];
		int j=0; //needed for increment in array b
		
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		System.out.println("Array after reverse copying is : ");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+ ",");
		}
		
		

	}

}
