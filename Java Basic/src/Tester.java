//// need to go thorugh once
//
//interface interface1{
//	int value1=20;
//	public int findValue(int val1);
//}
//
//abstract class Shape{
//	public static String color;
//	
//	
//	
//	public static String getColor() {
//		return color;
//	}
//	public static void setColor(String color) {
//		Shape.color = color;
//	}
//	public Shape() {
//		this.color = "red";
//	}
////	public String getColorr() {
////		return this.color;
////	}
//	abstract public void drawShape();
////	abstract public void setColor();
//}
//
//class Circle extends Shape implements interface1{
//	public void drawShape(){
//		System.out.println("Draw Circle");
//	}
////	public void setColor() {
////		this.color = "yellow";
////		System.out.println(Shape.color);
////	}
//	public int findValue(int val1) {
//		val1 = value1;
//		val1 += value1 + val1++;
//		
//		System.out.println("Finddddd" + Circle.color);
//		return val1+++this.color.length();
//	}
//}
//
//
//public class Tester {
//public static void main(String args[]) {
//	Shape circleObj = new Circle();
//	circleObj.setColor("yellow");
//	System.out.println("------"+ Shape.getColor());
//	System.out.println(Circle.color);
//	System.out.println(new Circle().findValue(5));
//	boolean val;
//	val = (5 == 5) || (6 == 6);
//	System.out.println(val);
//	
//}
//}

class Tester {
	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		System.out.println("Number of cars created: " + Car.getNumberOfCars());
	}

	static {
		System.out.println("Tester class loaded");
	}
}

class Car {
	private static String color;
	private static int numberOfCars = 0;

	static {
		System.out.println("Car class loaded");
	}

	public Car(String color) {
		this.color = color;
		numberOfCars++;
	}

	public static String getColor() {
		return color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}
}

