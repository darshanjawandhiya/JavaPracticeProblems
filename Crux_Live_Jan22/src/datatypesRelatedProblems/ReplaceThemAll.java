package datatypesRelatedProblems;

import java.util.Scanner;

public class ReplaceThemAll {
	   
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			long sum = 0;
			long count=1;
			if(n==0) //imp
	        {
	          sum+=5;
	        }
	        else
	        {
	            while (n > 0) {
				long digit = n % 10;
				if (digit != 0) {
					sum = digit * count + sum; //here i was making mistake
				} else {
					sum = 5* count+sum; //imp
				}
				n /= 10;
				count=count*10;	
			}
	        }
			System.out.println(sum);

		}
	}
