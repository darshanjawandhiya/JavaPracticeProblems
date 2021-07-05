package array;

public class CopyingAnArray {

	public static void main(String[] args) {
		 int a[]= {2,4,6,8,10,1,3,5,7,9};
		 int b[]=new int[10];
		 
		 //Copying An Array
		 for(int i=0;i<a.length;i++)
		 {
			 b[i]=a[i];
		 }
		 System.out.print("Array B : ");
		 
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.print(b[i]+ ",");
		 }
		 

	}

}
