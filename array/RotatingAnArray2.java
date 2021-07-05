package array;

public class RotatingAnArray2 {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,1,3,5,7,9};
		int temp=a[a.length-1];
		//Displaying array elements before rotation
		System.out.println( "Array elements before rotation:" );
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println();//next line
		
		for(int i=1;i<a.length;i++)
		{
			a[a.length-i]=a[a.length-i-1]; //right rotating the array
		}
		a[0]=temp;
		System.out.println("Right Rotated Array is:" );
		//Displaying array elements after rotation
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + ",");
		}

	} 

}
