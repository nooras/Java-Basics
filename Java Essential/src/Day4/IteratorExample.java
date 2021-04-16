package Day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("H");
		arr.add(0, "A");
		arr.add("C");
		Iterator<String> itr = arr.iterator();
		/*
		 hasnext
		 next
		 remove
		 */
		ListIterator<String> itr2 = arr.listIterator();
		/*
		 * hasNext
		 * next
		 * remove
		 * hasprevious
		 */
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			if(itr.next() == "A")
//				itr.remove();
			System.out.println("-----");
		}
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println("jbhvhv");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
//			itr2.remove();
			System.out.println("-----");
		}
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
//			itr.remove();
			System.out.println("-----");
		}
		
	}
}
