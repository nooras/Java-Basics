package DayFive;

public class Customer{
	public int CustomerId;
	public String CustomerName;
	private String CustomerAge;
	
	public String getCustomerAge() {
		return CustomerAge;
	}

	public void setCustomerAge(String customerAge) {
		CustomerAge = customerAge;
	}

	public Customer() {
		System.out.println("In customer");
	}
	
	public Customer(int CustomerId, String CustomerName) {
		this.CustomerId = CustomerId;
		this.CustomerName = CustomerName;
		System.out.println("In parametrixed customer");
	}
	
	public void cust_diplay() {
		System.out.println(this.CustomerName);
	}
	
//	public Customer() {
//		System.out.println("In customer");
//	}
	
//	private Customer() {
//		System.out.println("In customer");
//	}
//	Implicit super constructor Customer() is not visible. Must explicitly invoke  another constructor
	
}
