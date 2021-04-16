package Day4;

class Test<T, E>{
	T val;
	E val2;
	public void show() {
		System.out.println(val.getClass().getName());
		System.out.println(val2);
	}
}

public class GenericExample {
	public static void main(String[] args) {
		Test<Integer, String> value= new Test<Integer, String>();
		value.val = 1;
		value.val2 = "hello";
		value.show();
				
	}
}
