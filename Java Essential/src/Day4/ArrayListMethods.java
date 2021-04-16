package Day4;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("H");
		arr.add(0, "A");
		arr.add("C");
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("B");
		arr2.add("X");
		arr.addAll(arr2);
		arr.addAll(0, arr2);
		System.out.println(arr);
		
		System.out.println(arr.contains("X"));
		
	}
}
