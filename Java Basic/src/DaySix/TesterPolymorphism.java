package DaySix;

public class TesterPolymorphism {
	public static void main(String args[]) {
		Customer c = new Customer();
		c.cust_diplay();
		System.out.println("-----------------");
//		RegularCustomer r = new  RegularCustomer();
		System.out.println("-----------------");
		RegularCustomer r2 = new  RegularCustomer(654);
		r2.cust_diplay();
		
		Customer c2 = new RegularCustomer();
		c2.cust_diplay(); //override method + parent method
		c2.method();
//		System.out.println("-----------------");
//		r2.reg_display();
//		System.out.println("-----------------");
//		PremiumCustomer p = new  PremiumCustomer();
	}
}
