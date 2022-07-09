package array;

public class RotatingAnArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,1,3,5,7,9};
		int temp=a[0];
		//Displaying array elements before rotation
		System.out.println( "Array elements before rotation:" );
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println();//next line
		
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i]; //left rotating the array
		}
		a[a.length-1]=temp;
		System.out.println("Left Rotated Array is:" );
		////Displaying array elements after rotation
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + ",");
		}
	}
	

}
