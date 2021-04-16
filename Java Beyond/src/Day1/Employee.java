package Day1;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	public int id;
	public String name;
	private String des;
	private double salary;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}


	public int compare(Employee o1, Employee o2) {
		return o1.getId() - o2.getId();
	}
}
