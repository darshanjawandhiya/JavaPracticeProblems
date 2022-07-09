package array;

public class SortingArrayOfStrings {

	public static void main(String[] args) {
		//Sorting Using in-built method in package java.util.Arrays
		String arr[]= {"java","python","pascal","smalltalk","ada","basic"};
		
		java.util.Arrays.sort(arr);
		
		for(String x: arr)
		{
			System.out.println(x); //or you can use for loop too
		}

	}

}
