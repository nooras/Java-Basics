package Set9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

//copy
public class HashmapAssignment1 {
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		
		ArrayList<Integer> personSales = new ArrayList<>();
		ArrayList<String> persons = new ArrayList<>();
		for(Integer s: sales.values()){
			personSales.add(s);
		}
		Collections.sort(personSales);
		int i=personSales.size()-1;
		String person = "";
		while (i >= 0 ){
			for(Map.Entry<String,Integer> entry: sales.entrySet()){
				if(entry.getValue() == personSales.get(i)){
					persons.add(entry.getKey());
					i--;
					person = entry.getKey();
					break;
				}
			}
			sales.remove(person);
			person = "";
		}
		System.out.println(sales);
		return persons;
			
//		for()
		
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}
