package Set8;

public class RegularExpAssignment2 {
	public static boolean checkWebAddressValidity(String webAddress) {
        //Implement your code here and change the return value accordingly
		String reg = "(http|https)(:\\/\\/)(www)(\\.)?[A-Za-z0-9]*\\.(com|org|net)";
		if(webAddress.matches(reg))
			return true;
        return false; 
    }
      
    public static void main(String[] args) {
        
        //Change the value of webAddress for testing your code with different web addresses
        String webAddress = "http://www.company.com";
        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
