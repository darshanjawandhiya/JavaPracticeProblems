package array;

public class IncreasingSizeOfArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,10};
		int b[]=new int[2*a.length];
		
		System.out.println("Length of array a: "+a.length);
		
		//Copying array A to array B
		for(int i=0;i<a.length;i++)
		 {
			 b[i]=a[i];
		 }
		a=b; //changing reference of array b to a
		b=null; //assigning b null reference
		System.out.println("Length of array a after increasing size(changing reference) is : "+a.length);

	}

}
