/*
Hashset :

1. Doesnt alllow duplicates
2. Allow one null value
3. Is an unordered collectiion
4. eqqlas and 

Methods:
boolean .add(data)
boolean .addAll(collection)
int .size()
booolean .containes()
booleans .remove()
boolean .removeAll(collection)
.clear()
.isEmpty()

iterator()

LinkedinHashset:
- caonnot contain duplicates eleemnt
- order of elements is maintained
- allows a single null value
- uses equals and hashcode methods to detect duplicates

Treeset:
- caoont have duplicates
- data will be sorted in natural order
- canoot add null value

*/
package DayNine;
import java.util.*;

public class SetIntro {
 public static void main(String args[]) {
	 HashSet<String> set1 = new HashSet<String>();
	 Set<String> set2 = new HashSet<String>();
	 List<String> arr1 = new ArrayList<String>();
	 set2.add("A");
	 set2.add("B");
	 set2.add("B");
	 Iterator<String> iter = set2.iterator();
	 while(iter.hasNext()) {
		 String x = iter.next();
	 }
	 
	 Set<String> set3 = new LinkedHashSet<String>();
	 Set<String> set4 = new TreeSet<String>();
	 set3.add("A");
	 set3.add("B");
	 set3.add("C");
	 set3.add(null);
	 System.out.println(set3);
	 set4.add("D");
	 set4.add("B");
	 set4.add("C");
//	 set4.add(null);
	 System.out.println(set4);
	 
	 Set<String> set5 = new HashSet<String>();
	 System.out.println(set5);
	 Set<Emp> set6 = new HashSet<Emp>();
	 Emp e1 = new Emp();
	 e1.empName = "James";
//	 set6.add(e1.empName);
 }
}

class Emp{
	public String empName;
}

