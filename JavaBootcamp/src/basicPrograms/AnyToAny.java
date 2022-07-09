package basicPrograms;

import java.util.Scanner;

public class AnyToAny {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int src=sc.nextInt();
		int des=sc.nextInt();
		int num=sc.nextInt();
		int multiplier=1;
		//logic
		
		//base 8 to base 10 conversion
		int dec=0;
		while(num>0) {
			//divide by base 10
			int rem=num%10;
			num/=10;
			
			//multiply by power of src=base 8
			int value=rem*multiplier;
			//adding the values
			dec+=value;
			multiplier*=8;
			
		}
		//base 10 to base 2
		int bin=0;
		multiplier=1; 
		while(dec>0) {
			int rem=dec%2;
			dec=dec/2;
			
			
			//mul by 10
			int value=rem* multiplier;
			
			//adding values
			bin =bin +value;
			multiplier*=10;
			
		}
		System.out.println(bin);
		

	}

}
