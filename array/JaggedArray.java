package array;

public class JaggedArray {

	public static void main(String[] args) {
		int A[][];
		A= new int[3][];
		
		//jagged array code begins
		A[0]=new int[5];
		A[1]=new int[3];
		A[2]=new int[8];
		//Displaying jagged array
		for(int i=0;i<A.length;i++) //rows
		{
			for(int j=0;j<A[i].length;j++)//columns
			{
				System.out.print(A[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
