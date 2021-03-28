/*
ArrayList - Child Refereence
List - Parent

add(x)
addall(x)
addll(x,y)
arr.size()
arr.set(1,99)
arr.remove()
arr.removeall()
arr.removeall(arr1)
arr.indexOf(30)
arr.lastindexOf(30)
arr.contains(30) - return boolean
arr.comtainsall(arr)
arr.clear() - remove all the array list
arr.isEmpty()

hasNext() - Check last element is present or not - return boolean
next() - will return nect elemnet

iter.remove()

LinkedinList<Integer> llist1 = new linkedinList<>();
all the method present inside the linkedin list will be accessiable
be able to  access only overrideen methods if list interface but cannot access overriden methods od deque interface


collection class methods

objects[] toArray[]


*/
package DayEight;

import java.util.*;
import java.util.List;

public class ArrayListIntro {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(20);
		
		List<Integer> arr3 = new ArrayList<Integer>();
		arr3.addAll(arr2);
		
//		for(int i=0; i<arr3.size();i++) {
//			System.out.println(arr3.get(i));
//		}
//		for(int i:arr3) {
//			System.out.println(i);
//		}
		
		//traversing through iterator
		
		Iterator<Integer> iter = arr3.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator<Integer> iter1 = arr3.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter1.next());
		}
		
		while(iter1.hasPrevious()) {
			System.out.println(iter1.previous());
		}
		
		
	}
}
