/*
Create a new class Food in the Java project SwiftFood with the details given below.



*/

package DayTwoExercise;

class food {
	public String foodName;
	public String cuisine;
	public String foodType;
	public int quantityAvaiable;
	public double unitPrice;
	
	public void display() {
		System.out.println(foodName);
		System.out.println(cuisine);
		System.out.println(foodType);
		System.out.println(quantityAvaiable);
		System.out.println(unitPrice);
	}
}

public class ClassObject {
	public static void main(String[] args) {
		food f = new food();
		f.foodName = "Pizza";
		f.cuisine = "xyz";
		f.foodType = "Non veg";
		f.quantityAvaiable = 5;
		f.unitPrice = 654454.65;
		
		f.display();
	}
}
