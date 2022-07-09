package conditionalStatements;

import java.util.Scanner;

public class typeOfWebsite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter url of any website:");
		String url = sc.nextLine(); //taking i/p from user
		//code logic begins here
		//Protocol
		String protocol = url.substring(0,url.indexOf(':'));
		
		if(protocol.equals("http"))
		{
			System.out.println("Hypertext Transfer Protocol");
		}
		else if(protocol.equals("https"))
		{
			System.out.println("Hypertext Transfer Protocol(Secure)");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		else
		{
			System.out.println("Invalid Protocol");
		}
		//Extension
		String ext=url.substring(url.lastIndexOf('.')+1);
		
		if(ext.equals("com"))
		{
			System.out.println("Commercial");
		}
		else if(ext.equals("org"))
		{
			System.out.println("Organizational");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Network");
		}
		else
		{
			System.out.println("Invalid Extension");
		}
	}

}