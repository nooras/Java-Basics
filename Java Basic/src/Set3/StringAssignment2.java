package Set3;

public class StringAssignment2 {
	public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
//		String str2 = str;
		String temp = "" ;
		for(int i=str.length()-1; i>=0; i--) {
			temp += str.charAt(i);
		}
		if(temp.equals(str)) {
			return true;
		}
        return false;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
