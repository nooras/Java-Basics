package DayFour;

// Static block:
/*
help 
this - object reference
Can I access static variable ? yes
Can I acces local varible ? yes
Can I access insatnce varble ? no
instance varible 

insatnce method - you will have to access uisng obj reference
static method - you can direct=ly invoke it using classname-methodname
so invocation of static method can be done by creatig obj
invocatuon of statiuc method is not dependant on obj creatuin

if you dont make static method so you cant acces it witout creating object

Can static method access static varaoble? yes
Can static method access local varable? yes
Can static method access instace varaoble directly? no, unless u have object refernec
Can static method invoke instace method directly?

Association:
Uses a relation
where object of one class is used in another class only object of class can access its instance variable

Aggregation:
Object of one class is an instance variable in the other class.
we are making instance varible

*/

public class StaticStudent {
	
	public String name;
	public static int age;
	private String firstname;
	
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	static {
		System.out.println("Inside static");
	}
	static {
		System.out.println("Inside static 2");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside Student Main");
	}
}

class B{
	private static int var1;
	public static int price = 1000;
	public static int discount = 3;
	
	static {
		System.out.println("Inside static class B");
	}
	
	public void display() {
		System.out.println(StaticStudent.age);
	}

	public static int getVar1() {
		return var1;
	}

	public static void setVar1(int var1) {
		B.var1 = var1;
	}
	
	public static int calc_dis() {
		int amt = (int) (price* (discount/100));
		return amt;
	}
}
