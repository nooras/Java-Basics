package DayFive;

class Test1{
	public Test1() {
		System.out.println("In test1");
	}
	public Test1(String a) {
		System.out.println("In test1 " + a);
	}
}

class Test2 extends Test1{
	public Test2(String a, String b) {
		super("fatima");
		System.out.println(a + b);
	}
}

public class TesterInhertance {
	public static void main(String args[]) {
		
		Test2 temp = new Test2("abc", "xyz");
		
		
//		Customer c = new Customer();
//		System.out.println("-----------------");
//		RegularCustomer r = new  RegularCustomer();
//		System.out.println("-----------------");
//		RegularCustomer r2 = new  RegularCustomer(654);
//		System.out.println("-----------------");
//		r2.reg_display();
//		System.out.println("-----------------");
//		PremiumCustomer p = new  PremiumCustomer();
	}
}
