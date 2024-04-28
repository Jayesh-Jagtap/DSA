package basics;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Jayesh";
		String str2 = "Jayeshesh";

		String s = str;

		System.out.println("charAt Method : " + s.charAt(0));// charAt
System.out.println("-----------------------------------------------------------------------------");


		System.out.println("indexOf : " + str2.indexOf("h"));// always shows 1st occurrence
		System.err.println("indexOf : " + str2.indexOf("e", 6));// (character, where to start from)
		
		System.err.println("LastIndexOf1 : "+ str2.lastIndexOf("s"));
		
		// it will search last index from "Jayesh" itne me he search karega, coz we have restricted search till 5
		System.err.println("LastIndexOf2 : "+ str2.lastIndexOf("s",5));
		
		System.err.println("LastIndexOf3 : "+ str2.lastIndexOf("s",8));// now restriction here in 8
		
System.out.println("-----------------------------------------------------------------------------");

		System.err.println("Substring : "+ s.substring(0));
		System.err.println("Substring : "+ s.substring(2));
		System.err.println("Substring : "+ s.substring(1,2));
	

System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("startsWith-Single Method : " + s.startsWith("J"));// StartsWith
		System.err.println(s.startsWith("a", 1));// StartsWith - (character, index)

System.out.println("-----------------------------------------------------------------------------");

		System.out.println("endsWith-Single Method : "+ s.endsWith("h"));
		
System.out.println("-----------------------------------------------------------------------------");

		System.out.println("Replace: " + s.replace("J", "M"));
		System.out.println("Replace: " + s.replace("Jay", "Mn"));
		System.out.println("Replace: " + s.replace("J", "Mnop-"));

System.out.println("-----------------------------------------------------------------------------");
		System.out.println(s.toUpperCase());// toUpperCase
		System.out.println(s.toLowerCase());// toLowerCase

	}

}
