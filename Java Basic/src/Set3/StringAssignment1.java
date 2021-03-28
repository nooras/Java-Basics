package Set3;

public class StringAssignment1 {
	public static String moveSpecialCharacters(String str){
			//Implement your code here and change the return value accordingly
		String s1 = "";
		String s2 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='$' || str.charAt(i)=='^' ||
			   str.charAt(i)=='%' || str.charAt(i)=='&' || str.charAt(i)=='*' || str.charAt(i)=='#') {
				s2 += str.charAt(i);
			}
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')) {
//				System.out.println(str.charAt(i));
				s1 += str.charAt(i);
			}
			
//			if(str.charAt(i)=='!')
		}
	        return s1+s2;
	}
		
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
}
