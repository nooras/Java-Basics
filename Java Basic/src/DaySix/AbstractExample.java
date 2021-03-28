/*
Abstract classes :

Making abstract means you cannot make object of that class unless you ovevrride all the method of parents.

Either override all method of parent abstract method else make child abstract also.

Normal method can be present in abstract class


*/
package DaySix;

public class AbstractExample {
	public static void main(String args[]) {
		R ref1 = new R();
		ref1.display(5);
		ref1.method1();
	}
}


abstract class P{
	public abstract void display(int a);
	public abstract void method1();
	
	public void method3() {
		System.out.println("Inside P method3");
	}
	P(){
		System.out.println("Constructor P");
	}
}

abstract class Q extends P{
//	public void display(int a) {
//		System.out.println("Inside Q dispaly");
//	}
	
	Q(){
		System.out.println("Constructor Q");
	}
	
	public void method1() {
		System.out.println("Inside Q method");
	}
}

class R extends Q{
	public void display(int a) {
		System.out.println("Inside R dispaly");
	}
	
//	public void method1() {
//		System.out.println("Inside R method");
//	}
}