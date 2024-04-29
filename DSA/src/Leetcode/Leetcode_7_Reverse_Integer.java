package Leetcode;

public class Leetcode_7_Reverse_Integer {

	public static void main(String[] args) {
		
		int result = reverseInteger(123);
		System.out.println(result);

	}

	private static int reverseInteger(int x) {

	int ans = 0;
	
	if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
		
		return 0;
	}
	
	
	while(x != 0) {
		
	
	int rem = x % 10;
	ans = ans * 10 + rem;
	x = x / 10;
	
	}
	
	
	return ans;

	}

}
