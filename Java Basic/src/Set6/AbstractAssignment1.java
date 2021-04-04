package Set6;

abstract class Payment{
    //Implement your code here
	private int customerId;
	protected String paymentId;
	protected double serviceTaxPercentage;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}
	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	
	public Payment(int customerId) {
		this.customerId = customerId;
	}
	
	public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment{
    //Implement your code here
	private static int counter = 1000;
	private double discountPercentage;
	
// 	static {
// 		counter = 1000;
// 	}
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public DebitCardPayment(int customerId) {
		super(customerId);
		super.setPaymentId("D" + (++counter));
	}
	
	public double payBill(double amount) {
// 		double stp, dp; // serviceTaxPercentage, disocountpercentage
// 	    stp = (amount <= 500.0)? 2.5 : ((amount >500.0 && amount <=1000.0)? 4 : ((amount > 1000.0)? 5 :0));
// 		dp = (amount <= 500.0)? 1 : ((amount >500.0 && amount <=1000.0)? 2 :((amount > 1000.0)? 3 :0));
		
// 		amount = amount - ((amount*dp)/100) + ((amount * stp)/100);
// 		super.setServiceTaxPercentage(stp);;
// 		discountPercentage = dp;
// 		return amount;
      double tax,discount,bill=0.0;
			if(amount<=500){
				double serviceTaxPercentage=2.5;
				this.setServiceTaxPercentage(serviceTaxPercentage);
				discountPercentage=1;
				discount=(amount*discountPercentage)/100;
				tax=amount+(amount*serviceTaxPercentage/100);bill=tax-discount;
			}
			else if(amount>500&&amount<=1000){
				double serviceTaxPercentage=4;
				this.setServiceTaxPercentage(serviceTaxPercentage);
				discountPercentage=2;
				discount=(amount*discountPercentage)/100;
				tax=amount+(amount*serviceTaxPercentage/100);
				bill=tax-discount;
			}
			else if(amount>1000){
				double serviceTaxPercentage=5;
				this.setServiceTaxPercentage(serviceTaxPercentage);
				discountPercentage=3;
				discount=(amount*discountPercentage)/100;
				tax=amount+(amount*serviceTaxPercentage/100);
				bill=tax-discount;
			}
			return bill;

	}
}

class CreditCardPayment extends Payment{
    //Implement your code here
	private static int counter=1000;
	
// 	static {
// 		counter = 1000;
// 	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	public CreditCardPayment(int customerId) {
		super(customerId);
		super.setPaymentId("C" + (++counter));
	}
	
	public double payBill(double amount) {
		double stp; // serviceTaxPercentage
		stp = (amount <= 500)? 3 : (amount >500 && amount <=1000)? 5 : (amount > 1000)? 6 :0;
		
		amount = amount + (amount * stp/100);
		super.setServiceTaxPercentage(stp);
		return amount;
	}
	
}

public class AbstractAssignment1 {
	public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}
