package DayFive;

public class RegularCustomer extends Customer {
	public float discount;
	
	
	
	//Implicit call of customer class
	public RegularCustomer() {
		this.CustomerId = 65412;
		System.out.println("In Regular");
		System.out.println(this.CustomerId);
	}
	
	public RegularCustomer(float discount) {
		//super()  // same as implicit call
		super(1001, "John"); // Calling parent explicitly - super must be in first line
		// super is used to invoke the parent paraetrized class constructor and it must be 1st in line
		//Using super you can access instance variable
		// super - overriding
		
//		this(); // call same class, invoke non paramatrized of same class
		System.out.println("Parametrized Regular");
		this.discount = discount;
		System.out.println(this.discount);
		
		this.CustomerId = 55645;
		this.setCustomerAge("554");
		System.out.println("Age"+this.getCustomerAge());
		System.out.println(this.CustomerName + " " + super.CustomerName);
	}
	
	public void reg_display() {
		System.out.println("----------*****------------");
		this.cust_diplay();
		this.dis();
		System.out.println("-----------****-----------");
		dis();
		System.out.println(this.CustomerName);
		System.out.println("-----------****-----------");
	}
	
	public void dis() {
		System.out.println("Inside display");
	}
}
