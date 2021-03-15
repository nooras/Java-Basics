/*
continue statement is used to skip the current iteration of a loop and continue withthe 
next iteration. In case of while and do-while loops, continue statement skips the remaining 
code of the loop and passes the control to check the loop condition. Whereas 
in case of for loop, the control goes to the increment section and then the condition is checked.
*/
import java.util.Scanner;

public class IterationControlContinue {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		int unitPrice = 10;
		System.out.println("Enter the number of food items to be ordered");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
			if (counter == 3)
				continue;
			System.out.println("Enter the food item");
			String foodItem = sc.next();
			System.out.println("Enter the quantity");
			int quantity = sc.nextInt();
			System.out.println("You have ordered: " + foodItem);
			System.out.println("You have successfully placed the order number: "+ counter);
			totalCost += unitPrice * quantity;
			System.out.println("Total cost of the order: " + totalCost);
		}
	}
}

/*
Enter the number of food items to be ordered
4
Enter the food item
a
Enter the quantity
1
You have ordered: a
You have successfully placed the order number: 1
Total cost of the order: 10
Enter the food item
b
Enter the quantity
2
You have ordered: b
You have successfully placed the order number: 2
Total cost of the order: 30
Enter the food item
c
Enter the quantity
4
You have ordered: c
You have successfully placed the order number: 4
Total cost of the order: 70

 */
