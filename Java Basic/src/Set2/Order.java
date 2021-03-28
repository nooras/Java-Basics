package Set2;

import java.util.Scanner;

public class Order {
	//Methods - Assignment 1
	 
	public int OrderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	public Order(){
		status = "Ordered";
	}
	
	public Order(int orderId, String orderedFood){
		OrderId = orderId;
		orderedFoods = orderedFood;
		status = "unOrdered";
	}
	
	public double calculateTotalPrice(int unitPrice) {
		this.totalPrice = unitPrice + unitPrice * 0.05;
		return this.totalPrice;
	}
	
	public static void main(String[] args) {
		//Methods - Assignment 1
		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		order.OrderId = sc.nextInt();
		order.orderedFoods = sc.next();
		double totalPrice = order.calculateTotalPrice(sc.nextInt());
//		order.status = sc.next();
		System.out.println("Order Details");
		System.out.println("Order Id: " + order.OrderId);
		System.out.println("Ordered Food: " + order.orderedFoods);
		System.out.println("Order Status: " + order.status);
		System.out.println("Total Price: " + totalPrice);
		
		//Constructor and this keyword - Assignment 1
		System.out.println("----------------------------");
		System.out.println("Status of order 1: "+ order.status);
		Order order2 = new Order(1001, "Garlic Shrimp");
		System.out.println("Status of order 2: "+ order2.status);
		System.out.println("Id of order 2: "+ order2.OrderId);
		System.out.println("Items ordered in order 2: "+ order2.orderedFoods);
	}
}

/*
 * Methods - Assignment 1
101
Spinach
100
Ordered
Order Details
Order Id: 101
Ordered Food: Spinach
Order Status: Ordered
Total Price: 105.0
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

 *Constructor and this keyword - Assignment 1
 
123
Pizza
100
Order Details
Order Id: 123
Ordered Food: Pizza
Order Status: Ordered
Total Price: 105.0
----------------------------
Status of order 1: Ordered
Status of order 2: unOrdered
Id of order 2: 1001
Items ordered in order 2: Garlic Shrimp
*/
