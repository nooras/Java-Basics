/*
 in programming, when you want to repeatedly execute the statements as long as a condition is met, you can use the iteration control structure called while loop. When the condition becomes false, the while loop terminates and control goes to the statement written after the while loop. The while loop is used when the number of iterations are not known. In case of while loop, the condition is tested before entering the while loop block and hence it is known as an entry-controlled loop.
*/

package DayTwo;

public class WhileTryout {
	public static void main(String[] args) {
		int inputNumber = 7865;
		int sumOfDigits = 0;
		int temp = 0;

		while (inputNumber > 0) {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		}

		System.out.println("Sum of digits are : " + sumOfDigits);
	}
}

/*
 * Sum of digits are : 26
 */
