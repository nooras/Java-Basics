/*

\\d - Single Digits 0-9
\\d\\d - Duble digits
\\dxyz\\d - 5xyz5
\\D - Other than 0-9
\\w - alphanumeric and _
\\W - non word
\s - whitespace characters
*/

package DayEight;

public class RegexIntro {
	public static void main(String args[]) {
		String regex = "\\d";
		String str1= "9";
		System.out.print(str1.matches(regex));
	}
}
