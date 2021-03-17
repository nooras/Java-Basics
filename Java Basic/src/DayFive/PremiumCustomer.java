package DayFive;

public class PremiumCustomer extends RegularCustomer {
//	public float discount;
	// implicit call its parent constructor us made
	
	public PremiumCustomer() {
		super(656); // calling regular
		System.out.println("In Preminum");
	}
}
