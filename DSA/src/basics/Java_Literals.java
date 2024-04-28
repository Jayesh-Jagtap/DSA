package basics;

public class Java_Literals {

	public static void main(String[] args) {
		// 1 byte = 8 bits

// Byte Range : -128 to 127
// Byte size : 8 bits

		byte b = 12;
		System.out.println(b);

//--------------------------------------------------------------------		
		// Short range -32768 to 32767
		// Short size : 16 bits

		short s = 33;
		System.out.println(s);

//--------------------------------------------------------------------		
		// char size : 16 bits

		char ch = 'a';
		System.out.println("char:" + ch);

//--------------------------------------------------------------------

		// int range : -2,147,483,648 to 2,147,483,647
		// int size : 32 bits

		int i = 11;
		System.out.println(i);

//--------------------------------------------------------------------		
		// size : 64 bits
		long l = 1222222222222l;
		System.out.println(l);

//--------------------------------------------------------------------	
		// size : 32 bits
		float f = 123.22f;
		System.out.println("float : " + f);

//--------------------------------------------------------------------	
		// size : 64 bits
		//double d at end is not mandatory at some extents 
		double d = 798622222;
		System.out.println("double : " + d);

//--------------------------------------------------------------------	
		boolean boo = true;
		System.out.println("boolean value:" + boo);

//--------------------------------------------------------------------
		String str = "Jay";
		System.out.println("String : "+ str);
	}

}
