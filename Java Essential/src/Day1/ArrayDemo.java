package Day1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArrayDemo {
//	public static boolean checkWebAddressValidity(String webAddress) {
//        //Implement your code here and change the return value accordingly
//		String reg = "(http|https)(:\\/\\/)(www)(\\.)?[A-Za-z0-9]*\\.(com|org|net)";
//		if(webAddress.matches(reg))
//			return true;
//        return false; 
//    }
      
    public static void main(String[] args) {
        
//        //Change the value of webAddress for testing your code with different web addresses
//        String webAddress = "http://www.company.com";
//        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    	String regex = "([A-Za-z!\\s]+)";
        if("Hello everyone".matches(regex))
            System.out.println("hii");
        
    	LocalDateTime currentDate = LocalDateTime.now();

    	DateTimeFormatter df = DateTimeFormatter.ofPattern("eeee dd/MM/yyyy/ hh:mm:ss a");
    	System.out.println(df.format(currentDate)); 
    	//output :- Friday 06/03/2020/ 04:50:54 PM
    			
    	DateTimeFormatter dfNew = DateTimeFormatter.ofPattern("ee dd/MM/yyyy/ hh:mm:ss a");
    	System.out.println(df.format(currentDate));
    }
//	public static void main(String args[]) {
//		String[] pizzaSize = {"Regular", "Medium", "Large"};
//		int[] pizzaCost = {100, 250, 390};
//		String[] pizzaOrdered = {"Medium", "Regular"};
//		int[] quantityOrdered = {2, 1};
//		float totalAmount = 0f;
//		for(int index1 = 0; index1 < pizzaOrdered.length ; index1++) {
//		    for(int index2 = 0; index2 < pizzaSize.length ; index2++) {
//		        if ( pizzaOrdered[index1] == pizzaSize[index2] ) {
//		            totalAmount += pizzaCost[index2] * quantityOrdered[index1];
//		        }
//		        else {
//		            totalAmount += 0;
//		        }
//		    }
//		}
//		totalAmount = totalAmount - (totalAmount*(float)5/100);
//		System.out.println("Your total bill amount is: "+totalAmount);
//	}
}
