package Day4;

/*
ArrayList
Heterogeneous
*/
import java.util.*;

public class ArrayListExample {
 private static String String;
public static void main(String[] args) {
	 ArrayList<String> food = new ArrayList<String>();
//	 ArrayList food = new ArrayList();
	 food.add("Noodles"); // Adding the elements
	 food.add("Burger");
	 food.add("Pasta");
	 food.add("Sandwich");
	 food.add("Burger");
//	 food.add(2);
	 System.out.println(food);
	 findlongestString(food);
 }
 public static void findlongestString(List<String> lists) {
	 String longest = "";
	 for(String obj : lists) {
		 if(obj.length() > longest.length())
			 longest= obj;
	 }
	 System.out.println(longest);
 }
 
}
