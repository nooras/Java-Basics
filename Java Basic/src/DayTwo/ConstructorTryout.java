package DayTwo;

class Customer2 { 
	public String customerId; 
	public String customerName; 
	public long contactNumber; 
	public String address; 
			
//	public Customer2() { 
//		System.out.println("Parameterless constructor called"); 
//	}
		   
	public Customer2(String cId, String cName, long contact, String add) { 
		System.out.println("Parameterized constructor called"); 
		customerId = cId; 
		customerName = cName; 
		contactNumber = contact; 
		address = add; 
	} 
} 

class ConstructorTryout{
	public static void main(String args[]) { 
	    //the below line will lead to an error as there is no default constructor
//        Customer2 customer2 = new Customer2(); 	
        //if a parameterized constructor is created in a class, java doesn't create a default constructor
        //uncomment the parameterless constructor and then execute the code
        
        //the below code leads to an error as the parameters accepted by the constructor does not match the parameters passed
		Customer2 customer1 = new Customer2("C103", "Jacob", 5648394590L, "13th Street,  New York"); 
		//the order and type of the parameters passed for a parameterized constructor should match the definition properly
		
    } 
}


