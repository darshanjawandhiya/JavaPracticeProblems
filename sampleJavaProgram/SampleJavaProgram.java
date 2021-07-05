package sampleJavaProgram;

public class SampleJavaProgram {

	public static void main(String[] args) {
		
		String str1="programmer@gmail.com";
		int i=str1.indexOf("@"); //to check index of @
		int j=str1.indexOf("."); //to check index of .
		String user_name=str1.substring(0, i); //username
		String domain_name=str1.substring(i+1,str1.length()); //domain name

		
		
		System.out.println("Index of @ : "+i);
		System.out.println("Index of . : "+j);
		System.out.println("User name="+user_name);
		System.out.println("Domain name="+domain_name);
		System.out.println(domain_name.startsWith("gmail"));
		
	}

}
