package DayTwoExercise;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int number, factorial = 1;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i=number; i>=1; i--) {
			factorial *= i;
		}
		System.out.println("Factorial of a " + number + " is " + factorial);
		sc.close();
	}
}

/*
5
Factorial of a 5 is 120
-----------------------
7
Factorial of a 7 is 5040

*/
