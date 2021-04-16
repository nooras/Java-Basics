package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesterStream {
	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(10, "Nooras"));
		l.add(new Employee(102, "Noorasss"));
		
		//from collection
		Stream<Employee> e = l.stream();
		
		// from arrays
		int[] i = {1,2,3,5,8};
		IntStream se = Arrays.stream(i);
		
		//from values
		Stream<String> ss = Stream.of("Hellow world", "Good morning");
		
		Integer[] j = {5,65,54,5};
		
		Stream<Integer> j2 = Arrays.stream(j);
		
		System.out.println("Updated Emplyee data");
		
		// will update
		e.map((e1)->{
			e1.setId(e1.getId() + 2);
			return e1;
		}).forEach(System.out::println);
		
		//e.forEach(System.out::print); // will give error
				
		Stream<Employee> emp = l.stream();
		//Will count
		long countid = emp.map((e1)->{
			e1.setId(e1.getId() + 2);
			return e1;
		}).count();
		System.out.println("EMployee count: "+countid);
		
		System.out.println("Saving employee data as a list and showing them...");
		
		Stream<Employee> emp2 = l.stream();
		//accepting predicate - return modified stream
		List<Employee> le = emp2.map((e1)->{
			e1.setId(e1.getId() + 2);
			return e1;
		}).filter((a)-> a.getId() > 10)
		.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
		.collect(Collectors.toList());  //terminal opeartor - saving as a list stream
		
		le.forEach(System.out::println);
		
		System.out.println("Saving employee data as a map and showing them..");
		Stream<Employee> emp3 = l.stream();
		Map<Integer, Object> map1 = emp3.map((e1)->{
			e1.setId(e1.getId() + 2);
			return e1;
		}).filter((a)-> a.getId() > 10)
		.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
		.collect(Collectors.toMap(Employee:: getId, e1-> e));  //terminal opeartor - saving as a list stream
		
		Set<Integer> key = map1.keySet();
		key.forEach(System.out::print);
				

	}
}
