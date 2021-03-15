package Set1;

//import java.lang.*;
import java.util.Scanner;

public class FarenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Farenheit = sc.nextInt();
		int Celsius = ((Farenheit-32)/9)*5;
		System.out.println(Celsius);
	}
}

/*
Output:
32
0
-----
50
10

*/
	