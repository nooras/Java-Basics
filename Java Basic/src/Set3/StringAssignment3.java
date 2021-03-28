package Set3;

public class StringAssignment3 {
	public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
		String x = "" ;
		int start, head;
		start = 0;
		head = 0;
        while(true) {
        	for(int j=start; j<str.length(); j++) {
        		if(str.charAt(j) == ' ') {
            		head = j-1;
            		break;
            	}
        		if(j==str.length()-1) {
        			head = j;
        			break;
        		}
        	}
        	for(int k=head; k>=start;k--) {
        		x += str.charAt(k);
        	}
        	if(head == str.length()-1) {
        		break;
        	}
        	else {
        		x += " ";
        		start = head+2;
        	}
        }
        return x;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
