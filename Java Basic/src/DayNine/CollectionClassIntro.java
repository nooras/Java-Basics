/*
Collection Class:

sort
reverse
max
min
reverseAll
copy
rotate
shuffle
sort
swap


Object[] toArray() methods

list
descending iterator - presnet only for linkedin list - doesnt belong to list - hasnext and next
*/
package DayNine;

import java.util.*;

public class CollectionClassIntro {
	 public static void main(String args[]) {
		 List<String> alist = new ArrayList<String>();
		 
		 alist.add("d");
		 alist.add("b");
		 alist.add("c");
		 
		 System.out.println(alist);
		 
		 Collections.sort(alist);
		 
		 System.out.println(alist);
		 
		 Collections.reverse(alist);
		 
		 System.out.println(alist);
		 
		 boolean b2 = Collections.replaceAll(alist, "d", "a");
		 
		 System.out.println(alist);
		 
		 String data1 = Collections.min(alist);
		 String data2 = Collections.max(alist);
		 int data3 = Collections.frequency(alist, data2);
		 System.out.println(data1 + " " + data2 + " " + data3);
		 
		 List<String> src = new ArrayList<String>();
		 
		 src.add("A");
		 src.add("B");
		 src.add("C");
		 
		 List<String> dest = new ArrayList<String>();
		 
		 dest.add("E");
		 dest.add("D");
		 
		 System.out.println(src);
		 System.out.println(dest);
		 
		 Collections.copy(src, dest);
		 System.out.println(src);
		 System.out.println(dest);
		 
		 Collections.rotate(alist, 2);
		 System.out.println(alist);
		 
		 Collections.shuffle(alist);
		 System.out.println(alist + "------------");
		 
		 Collections.swap(alist, 1, 2);
		 System.out.println(alist);
		 
		 //Object[] toArray() methods
		 Object[] a = alist.toArray(); //return array of object
		 
		 for(int i=0; i<a.length; i++) {
			 System.out.println(a[i]);
		 }
		 
		 String[] array1 = {"a","b","c","d"};
        List<String> list1 = Arrays.asList(array1);
        System.out.println(list1);
		 
		 //////////////////////////
		 List<Integer> linklist2 = new LinkedList<Integer>(); //interface
		 
//		 Iterator<>
		 
	 }
}
