/*
Observe the code given below. The object of child class is getting created by passing parameters to the child class constructor but the variables get initialized using the parent class constructor.
*/
package DayFive;

class Employee2 {
	int employeeId;
	String employeeName;

	// Parameterized constructor
	Employee2(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void display() {
		System.out.println("Employee details");
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
	}
}

class Manager2 extends Employee2 {
	private String designation;

	Manager2(int employeeId, String employeeName, String designation) {
		super(employeeId, employeeName);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

class InheritanceTryout {
	public static void main(String[] args) {
		Manager2 obj = new Manager2(101, "John", "Lead");
		obj.display();
		System.out.println("Designation: " + obj.getDesignation());
	}
}

