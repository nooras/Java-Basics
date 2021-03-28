/*
Hashmap:

It is used to store key, value pair

HashMap<key, value>

keys are uniques
value can be duplicate
unordered
Hashset is internal implemetaion of 

Methods:
put
get
remove
size
containsKey
conatinsValue
*/

package DayNine;

import java.util.HashMap;
import java.util.Map;

public class HashmapIntro {
	 public static void main(String args[]) {
		 Map<String, Integer>  map1 = new HashMap<String, Integer>();
		 //Adding elements to the map
		 System.out.println(map1.put("Val1", 1)); //gives null for 1 time entry
		 System.out.println(map1.put("Val2", 1));
		 System.out.println(map1.put("Val3", 1));
		 System.out.println(map1);
		 System.out.println(map1.put("Val3", 2));
		 System.out.println(map1);
		 
		 //getting
		 System.out.println(map1.get("Val3"));
		 System.out.println(map1.get(100));
		 
		 //removing
		 System.out.println(map1.remove("Val3"));
		 System.out.println(map1);
		 System.out.println(map1.size());
		 System.out.println(map1.containsKey("Val"));
		 System.out.println(map1.containsValue(2));
	 }
}
