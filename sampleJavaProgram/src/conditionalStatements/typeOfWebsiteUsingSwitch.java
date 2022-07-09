package conditionalStatements;

import java.util.Scanner;

public class typeOfWebsiteUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter url of any website:");
		String url=sc.nextLine();
		String ext=url.substring(url.lastIndexOf(".")+1);
		//code begins
		switch(ext)
		{
		case "com" : System.out.println("Commercial");
				 break;
		case "org" : System.out.println("Organizational");
		 		 break;
		case "net" : System.out.println("Network");
				 break;
		default: System.out.println("Invalid entry");
		}
	}

}
