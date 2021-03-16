/*
 The 'for' loop is used when the number of iterations are known.  

Initialization: It is used for initializing the variables used for checking the condition. It is executed only once and gets executed when the loop starts.

Condition: It is used for checking the condition to decide whether the loop should be terminated or executed. If the condition is true, the body of the loop is executed, else the loop terminates.  

Increment / Decrement: It increments or decrements the value of the variable used for checking the condition after every iteration of the loop.  

All the three parts of for loop are optional. For instance, the for loop can also be written as for(;;) where none of the parts are provided. This for loop will result in infinite loop.
 */
package DayTwo;

public class ForTryout {
	public static void main(String[] args) {
		// The below code generates customerId
		int totalNoOfCustomers = 12;
		String customerId = "";
		for (int counter = 1; counter <= totalNoOfCustomers; counter++) {
			if (counter <= 9)
				customerId = "C0" + counter;
			else
				customerId = "C" + counter;
			System.out.println("Customer Id for customer " + counter + " is "
					+ customerId);
		}
	}
}

/*
Customer Id for customer 1 is C01
Customer Id for customer 2 is C02
Customer Id for customer 3 is C03
Customer Id for customer 4 is C04
Customer Id for customer 5 is C05
Customer Id for customer 6 is C06
Customer Id for customer 7 is C07
Customer Id for customer 8 is C08
Customer Id for customer 9 is C09
Customer Id for customer 10 is C10
Customer Id for customer 11 is C11
Customer Id for customer 12 is C12

*/
