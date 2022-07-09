package methods;

public class MaxElementInArray {
	static int arr[]= {1,3,5,7,9,22,41,6,10,8};
	
	//Method to find max element in array
	static int largest()
	{
		int max =arr[0]; //Initialising maximum element
		
		for(int i =0 ; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Largest element in array is : "+largest());
	}
	}

