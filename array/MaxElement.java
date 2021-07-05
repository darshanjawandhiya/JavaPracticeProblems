package array;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,9,2,4,6,8};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
				System.out.println("Max Element in array is "+max);
	}

}
