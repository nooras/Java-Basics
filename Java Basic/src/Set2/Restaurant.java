package Set2;

//import java.util.Scanner;

public class Restaurant {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	
	///Methods - Assignment 2
	public Restaurant(String name, long contact, String address, float rate) {
		restaurantName = name;
		restaurantContact = contact;
		restaurantAddress = address;
		rating = rate;
	}
	
	//Constructor and this keyword - Assignment 2
	public void displayRestaurantDetails() {
		System.out.println("Restaurant Details");
		System.out.println("********************");
		System.out.println("Restaurant Name: "+ restaurantName);
		System.out.println("Restaurant Rating: " + rating);
		System.out.println("Restaurant Conact: " + restaurantContact);
		System.out.println("Restaurant Address: " + restaurantAddress);
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Restaurant restaurant = new Restaurant("McDonald's", 9988676767L, "Sh10, Carolina Street, SoringField",  4.1f); //Constructor and this keyword - Assignment 2
		
		//Methods - Assignment 2
		 
//		restaurant.restaurantName = "McDonald's";
//		restaurant.restaurantContact = 9988676767L;
//		restaurant.rating = 4.1f;
//		restaurant.restaurantAddress = "Sh10, Carolina Street, SoringField";
		restaurant.displayRestaurantDetails();
	}
}

/*
Restaurant Details
********************
Restaurant Name: McDonald's
Restaurant Rating: 4.1
Restaurant Conact: 9988676767
Restaurant Address: Sh10, Carolina Street, SoringField
*/
