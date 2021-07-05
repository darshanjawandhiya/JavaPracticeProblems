package array;

public class AddingMatrices {

	public static void main(String[] args) {
		int a[][]= {{2,4,6},{8,10,12},{14,16,18}};
		int b[][]= {{1,3,5},{7,9,11},{13,15,17}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)//rows
		{
			for(int j=0;j<a[i].length;j++)//columns
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		//Printing Array after addition
		System.out.println("Array A + Array B = ");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println(); 
		}
	

	}

}
