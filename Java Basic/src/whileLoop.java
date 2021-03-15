/*
Similarly, in programming, when you want to repeatedly execute the statements as long as a 
condition is met, you can use the iteration control structure called while loop. When the 
condition becomes false, the while loop terminates and control goes to the statement written
after the while loop. The while loop is used when the number of iterations are not known. 
In case of while loop, the condition is tested before entering the while loop block and 
hence it is known as an entry-controlled loop.  

Syntax: 

while (<condition>) { 
   <statements>; 
} 

*/
import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		char wantToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;
		while (wantToAddFoodItem == 'Y') {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order placed successfully");
			System.out.println("Total cost: " + totalCost);
			System.out.println("Do you want to add more food items to your order? Y or N");
			String input = sc.next(); // Accepting input from the customer
            // Extracting first character from the input string
			wantToAddFoodItem = input.charAt(0); 
		}
	}
}
