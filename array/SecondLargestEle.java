package array;

public class SecondLargestEle {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,9, 2,4,6,8};
		int max1,max2;
		max1=max2=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("Second largest element is : "+max2);

	}

}
