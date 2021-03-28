package DayNine;

import java.util.ArrayDeque;
import java.util.*;



public class DequeDemo {
	 public static void main(String args[]) {
		 ArrayDeque<String> arr1 = new ArrayDeque<String>();
		 Deque<String> arr2 = new ArrayDeque<String>();
		 
		 //adding
		 arr1.add("alice");
		 arr1.add("bob");
		 arr1.offer("jay");
		 System.out.println(arr1);
		 
		 //accessing front most element
		 System.out.println(arr1.element());
		 System.out.println(arr1.peek());
		 System.out.println(arr1);
		 
		 //removing first element - FIFO
		 System.out.println(arr1.remove());
		 System.out.println(arr1);
		 System.out.println(arr1.element());
		 System.out.println(arr1.poll());
		 
		 //deque
		 arr2.push("x");
		 arr2.push("y");
		 arr2.push("z");
		 
		 System.out.println(arr2);
		 System.out.println(arr2.pop());
		 
		 Queue<String> arr3 = new ArrayDeque<String>();
		 arr3.add("5");
	 }
}
