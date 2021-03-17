package DayTwoExercise;

import java.util.Scanner;

class Calculator {

	// Implement your code here
	public double findAverage(int number1, int number2, int number3) {
		double avg = (double) ((number1 + number2 + number3) / 3.0);		
		long factor =  (long) Math.pow(10, 2);
		avg = avg * factor;
	    long tmp = Math.round(avg);
	    return (double) tmp/factor;
		
//		String str = String.format("%.02f", avg);
	}
	
}

public class AvgOf3Num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		Calculator calculator = new Calculator();
//		double avg = calculator.findAverage(num1, num2, num3);
		System.out.println(calculator.findAverage(num1, num2, num3));
		// Invoke the method findAverage of the Calculator class and display the average
	}
}

/*
Output:
12
8
15
11.67
--------------
10
20
30
20.0


*/
