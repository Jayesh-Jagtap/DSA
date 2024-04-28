package basics;


public class Java_methods {
	
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 12;
		
		//First method to call function
		Java_methods m1 = new Java_methods();
		m1.add(a,b);
		
		//2ns method is make function static & call directly without creation Object of function.
		//add(a,b)
		
		
	}
	
	
	 int add(int x, int y) {
		
		int c = x+y;
		System.out.println("Performing Addition : " + c);
		
		return c;
		
	}

}
