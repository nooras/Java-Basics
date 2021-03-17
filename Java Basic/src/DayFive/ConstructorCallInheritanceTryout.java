package DayFive;

class Employee {
	Employee() {
		System.out.println("Employee constructor invoked");
	}
}

class Manager extends Employee {
	Manager() {
		System.out.println("Manager constructor invoked");
	}
}

class ConstructorCallInheritanceTryout {
	public static void main(String[] args) {
		Manager manager = new Manager();
	}
}

