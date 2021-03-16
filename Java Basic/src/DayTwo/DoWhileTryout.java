/*
When the loop has to be executed at least once before the condition is checked, do-while loop is used. After the first execution, the loop then gets repeated as long as the condition is true. In case of do-while loop, the condition is tested after executing the code block. Hence, it is called an exit-controlled loop.  
*/
package DayTwo;

public class DoWhileTryout {
		public static void main(String[] args) {
			int inputNumber = 9654;
			int sumOfDigits = 0;
			int temp = 0;

			do {
				temp = inputNumber % 10;
				sumOfDigits += temp;
				inputNumber = inputNumber / 10;
			} while (inputNumber > 0);

			System.out.println("Sum of digits : " + sumOfDigits);
		}
}

/*
Sum of digits : 24

*/