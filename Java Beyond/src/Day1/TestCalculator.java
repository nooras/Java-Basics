package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestCalculator {
	Calculator c = new Calculator() {
		public int calculate(int a, int b) {
			return a+b;
		}
//		public int calculate(int a) {
//			return a;
//		}
	};
	
	public void print(Calculator c, int a, int b) {
		//c.calculate(a); // 1 para
		c.calculate(a, b);
	}
	
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.calculate(5, 2));
		
		TestCalculator tc = new TestCalculator();
//		tc.c.calculate(2, 2);
		
		//lambda
		//3para
		//parameter  - data type is optional
		//lambda operator -  ->
		//body of lambda - some calculation in brackets/ without brackets
		//we use lambda to implement built in
		
		// is used to impelmenet functional interface - interface having only one abstract method is called functional interface 
		Calculator add = (int a, int b) -> {return a + b;};
		System.out.println("Addition : " + add.calculate(5, 6));
		Calculator sub = (a, b) -> {return a - b;};
		System.out.println("Subtraction : " + sub.calculate(5, 6));
		Calculator multi = (a, b) -> a * b;
		System.out.println("Multiplication : " + multi.calculate(5, 6));
		
		CalculateSquare x = (a) -> {
			System.out.println("In lamda of calculate square");
			return a*a;
		};
		System.out.println("Square : " + x.square(5));
		//parameter less funtional interface
//		CalculateSquare xx = () -> {
//			System.out.println();
//			return 1;
//		};
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(10, "Nooras"));
		l.add(new Employee(102, "Noorasss"));
		
		//Sort accepting comparator interface
		//		l.sort((e1, e2) -> e1.getName().compareTo(e2.getName());
		l.sort(new Employee());
		
		l.sort((e1, e2) -> e1.getId()-e2.getId());
		
		//:: method refernce operator - calling an existing method
		l.forEach(System.out :: println);
		
		// passing elemnt and printing that elemnt - cutomize
		l.forEach((e1) -> System.out.println(e1));
		
		TestCalculator tc2 = new TestCalculator();
		// with 1 para
		System.out.println("------------------");
		tc2.print((p, q) -> (p), 7, 9);
		System.out.println("------------------");
		
		// with 2 para 
//		tc2.print((p, q) -> System.out.println(p, q), 7, 5);
		
		
	}
}
