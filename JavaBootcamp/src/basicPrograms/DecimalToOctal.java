package basicPrograms;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int minFarhTemp=sc.nextInt();
		int maxFarhTemp=sc.nextInt();
		int step=sc.nextInt();
		
		for(int currTempFarh=minFarhTemp;currTempFarh<=maxFarhTemp;currTempFarh+=step) {
			
			int currCelsiusTemp=(int)((5.0/9)*(currTempFarh-32));
			System.out.println(currTempFarh+ " "+currCelsiusTemp);
			
		}
	}

}
