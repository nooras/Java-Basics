
public class IterationControlFor2 {
	public static void main(String[] args) {
		// The below code generates customerId
		int totalNoOfCustomers = 12;
		String customerId = "";
		for (int counter = 1; counter <= totalNoOfCustomers; counter++) {
			if (counter <= 9)
				customerId = "C0" + counter;
			else
				customerId = "C" + counter;
			System.out.println("Customer Id for customer " + counter + " is "
					+ customerId);
		}
	}
}

/*
Customer Id for customer 1 is C01
Customer Id for customer 2 is C02
Customer Id for customer 3 is C03
Customer Id for customer 4 is C04
Customer Id for customer 5 is C05
Customer Id for customer 6 is C06
Customer Id for customer 7 is C07
Customer Id for customer 8 is C08
Customer Id for customer 9 is C09
Customer Id for customer 10 is C10 
*/