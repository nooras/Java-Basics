package Set8;

import java.util.LinkedList;
import java.util.List;


public class LinkedlistAssignmnet1 {
	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
		List<Integer> list2 = new LinkedList<Integer>();
		for(Integer x: list) {
			if(list2.contains(x)) {
				continue;
			}else {
				list2.add(x);
			}
		}
        return list2;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
}
