package basics;

public class Strings {

	public static void main(String[] args) {

		String str1 = "String 1";
		System.out.println("ID1: " + System.identityHashCode(str1));

		str1 = "String 2";
		System.out.println("ID2: " + System.identityHashCode(str1));

		String s1 = "Jayesh";
		s1.concat(" Jagtap");
		System.out.println("s1 refers to: " + s1);

	}

}
