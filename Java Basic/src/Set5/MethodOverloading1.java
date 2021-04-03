package Set5;
class Bill{
    //Implement your code here
	public double findPrice(int itemId) {
		if(itemId==1001)
			return 25;
		else if(itemId==1002)
			return 20;
		else if(itemId==1003)
			return 23;
		else if(itemId==1004)
			return 18;
		return 0;
		
	}
	public double findPrice(String brandName, String itemType, int size) {
		double price = 0;
		if(brandName == "Puma") {
			if(itemType=="T-shirt") {
				if(size==34 || size==36)
					price = 25;
			}
			if(itemType=="Skirt") {
				if(size==38 || size==40)
					price = 20;
			}
		}
		if(brandName == "Reebok") {
			if(itemType=="T-shirt") {
				if(size==34 || size==36)
					price = 23;
			}
			if(itemType=="Skirt") {
				if(size==38 || size==40)
					price = 18;
			}
		}
		return price;
	}
}

public class MethodOverloading1 {
public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
}
