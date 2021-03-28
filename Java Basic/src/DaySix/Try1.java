package DaySix;

public class Try1 {
	public static void main(String args[]) {
		A ref1 = new A();
		A ref2 = new B();
		A ref3 = new C();
		
		A[] arr = {ref1, ref2, ref3};
		sum_values(arr);
	}
	
	public void sum_values(A[] arr) {
		int sum = 0;
		for(arr: a) {
			
		}
	}

}

class A{
	public int value() {
		return 10;
	}
}

class B extends A{
	public int value() {
		return 20;
	}
}

class C extends B{
	public int value() {
		return 30;
	}
}
