/*
HashSet
1. hash tables for Store unique element
2. unordered
3. Depend on equals() and hashCode() methods for detecting duplicates
4. null values are allowed

Set<String> uniqueItems = new HashSet<String>(); 

LinkedHashSet
1. LinkedHashSet uses a combination of hash tables and linked lists for storing elements
2. order based on insertion
3. depends on the equals() and hashCode() methods for detecting duplicates
4. null values are allowed

Set<String> uniqueItems = new LinkedHashSet<String>();

TreeSet:
1. TreeSet uses a tree-based data structure for storing elements
2. Natural ordered like aplhabetical ordereed
3. depends on compareTo() method for ordering as well as for detecting duplicates.

Set<String> uniqueItems = new TreeSet<String>();

*/
package DayNine;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class HashSetTryout {
	public static void main(String[] args) {
		// Creating HashSet
		Set<String> food = new HashSet<String>();

		// Checking if a HashSet is empty
		System.out.println("Is the set empty? : " + food.isEmpty());

		// Adding elements to the HashSet
		food.add("Pasta");
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("Set output without the duplicates: ");
		System.out.println(food);

		// Finding the size of the HashSet
		System.out.println("The number of food items in the set: " + food.size());

		// Checking if the HashSet contains the given element
		String foodItem = "Pasta";
		if (food.contains(foodItem))
			System.out.println(foodItem + " is already ordered");
		else
			System.out.println(foodItem + " is not ordered");

		// Removing an element from the HashSet
		if(food.remove("Burger"))
		    System.out.println("Output after removing Burger from the set:" + food);

		// Traversing elements
		Iterator<String> item = food.iterator();

		while (item.hasNext())
			System.out.println(item.next());

		// Removing all the elements from the HashSet
		food.clear();
		System.out.println("After clear() => " + food);
	}
}
