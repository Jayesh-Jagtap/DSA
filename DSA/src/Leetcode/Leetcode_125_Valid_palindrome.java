package Leetcode;

public class Leetcode_125_Valid_palindrome {

	public static void main(String[] args) {
		
		String str = "A man, a plan, a canal: Panama";
		//"race a car" - false case
		
		System.out.println(isPalindrome(str));
		

	}
	//Two Pointer
	public static boolean isPalindrome(String s) {
		
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		
		int i = 0;
		int j = s.length()-1;
		
		while(i<=j) {
			
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		
		return true;
		
		
	}

}
