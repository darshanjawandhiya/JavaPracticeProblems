package sampleJavaProgram;

public class removeSpecialChar {

	public static void main(String[] args) {
//		String str = "A@b12#34$dj^bravo&12*3";
//		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		
		
		String str= "  abc   def  gh   ijk   ";
		str=str.replaceAll("\\s+"," ").trim();
		System.out.println(str);
		String words[]=str.split("\\s");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		System.out.println("Length of string: "+words.length);
				
	}

}
