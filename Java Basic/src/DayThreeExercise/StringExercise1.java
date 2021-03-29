package DayThreeExercise;

public class StringExercise1 {
	public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
		String x = "";
		for(int i=0; i< str.length();i++) {
			if(str.charAt(i) != ' ') {
				x += str.charAt(i);
			}
		}
//		String x = str.replaceAll("\\s","");
        return x;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
