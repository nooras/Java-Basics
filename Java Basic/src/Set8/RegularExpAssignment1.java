package Set8;

public class RegularExpAssignment1 {
	 public static boolean checkPasswordValidity(String password) {
		 //pending
	        //Implement your code here and change the return value accordingly
//		 String reg = "[[a-z]{1,}[A-Z]{1,}\\d{1,}[*@#$%^&*+]{1,}]{8,20}";
//		 String reg2 = "?[A-Za-z ]{2,30}";
		 String reg = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z0-9!@#$%^&*_]{8,20}";
		 if(password.matches(reg))
			 return true;
	        return false;
	    }
	 
	    
	    public static void main(String[] args) {
	        
	        //Change the value of password for testing your code with different passwords
	        String password = "p@Sword2";
	        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
	    }

}
