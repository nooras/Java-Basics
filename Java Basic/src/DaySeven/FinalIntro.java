
/*
Final :

Constant

When a variable is made final, you cans assugn the calue to that varible only once
1. While declaring the instance you cannot modify/update the varible
2. when a instance variable is declared and if no value is assigned -> blank final variable
3. You can have static final keyword
4. Static final - > must access with class name
5. Final Method -> cannot be overridden
6. Final class -> cannot be inherited
7. Final metod can be overloaded
8. Abstract method cannot be final
9. Can overlaod final method
10. Final class cannot be sub-classed
*/

package DaySeven;

public class FinalIntro {
	public String studentName; // update again again anywhere
	public long contactNumber;
	public final int rollno; //Blank Final variable
	public final int num=10; 
	private final int num3=10; // priavte final have oonly getNum() no setNum()
	public static final int num2; //instance varible
	
	// must static block for final keyword
	static {
		num2 = 5;
	}
	
	FinalIntro(String studenName, long contactNumber, int rollno){
		this.studentName = studentName;
		this.contactNumber = contactNumber;
		this.rollno = rollno; //initialization of final word
	}
	
	public static void main(String args[]) {
		FinalIntro obj1 = new FinalIntro("John", 55454454, 5454);
		
		final int num1 = 1000;
		//num1=5454; //The final local variable num1 cannot be assigned. It must be blank and not using a compound assignment 
//		obj1.rollno = 26544;
	}
}

class A{
	void display() {
		int a = 10;
//		System.out.println("in Display", Student.num);
	}
	public final void example() {
		int a = 20;
		a = 40;
		System.out.print("Class A final method");
	}
}

class B extends A{
	public void display() {
		this.example();
		super.example();
	}
}
