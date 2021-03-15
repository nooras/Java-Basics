/*
 The 'for' loop is used when the number of iterations are known.
 
Syntax: 

for (<initialization>; <condition>; <increment/decrement>) { 
  <statements>; 
} 
Initialization: It is used for initializing the variables used for checking the condition. It is executed only once and gets executed when the loop starts.

Condition: It is used for checking the condition to decide whether the loop should be terminated or executed. If the condition istrue, the body of the loop is executed, elsethe loop terminates.  

Increment / Decrement: It increments or decrements the value of the variable used for checking the condition after every iteration of the loop.  

All the three parts of for loop are optional. For instance, the for loop can also be written as for(;;) where none of the parts are provided. This for loop will result in infinite loop.
 */
import java.util.Scanner;

public class IterationControlFor {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		int unitPrice = 10;
		System.out.println("Enter the number of food items to be ordered");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
			System.out.println("Enter the food item");
			String foodItem = sc.next();
			System.out.println("Enter the quantity");
			int quantity = sc.nextInt();
			System.out.println("You have ordered: " + foodItem);
			totalCost += unitPrice * quantity;
			System.out.println("Order placed successfully!");
			System.out.println("Total cost of the order: " + totalCost);
		}
	}
}

/*
Enter the number of food items to be ordered
2
Enter the food item
pizza
Enter the quantity
2
You have ordered: pizza
Order placed successfully!
Total cost of the order: 20
Enter the food item

Burger
Enter the quantity
3
You have ordered: Burger
Order placed successfully!
Total cost of the order: 50

 */