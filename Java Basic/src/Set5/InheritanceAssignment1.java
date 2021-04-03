package Set5;

//class Employee {
//    
//    //Implement your code here 
//	
//	private int employeeId;
//	private String employeeName;
//	private double salary;
//	public int getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
//	public Employee(int employeeId, String employeeName) {
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//	}
//	
//    
//    //Uncomment the below method after implementation before verifying 
//    //DO NOT MODIFY THE METHOD
//    /*
//    public String toString(){
//        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
//    }
//    */
//}
//
//
//class PermanentEmployee extends Employee {
//      
//    //Implement your code here 
//	private double basicPay;
//	private double hra;
//	private float experince;
//	public double getBasicPay() {
//		return basicPay;
//	}
//	public void setBasicPay(double basicPay) {
//		this.basicPay = basicPay;
//	}
//	public double getHra() {
//		return hra;
//	}
//	public void setHra(double hra) {
//		this.hra = hra;
//	}
//	public float getExperince() {
//		return experince;
//	}
//	public void setExperince(float experince) {
//		this.experince = experince;
//	}
//	
//	public PermanentEmployee(int employeeId, String name, double basicPay, double hra, float experince ) {
//		super(employeeId, name);
//		this.basicPay= basicPay;
//		this.hra = hra;
//		this.experince = experince;
//	}
//	
//	public void calculateMonthlySalary() {
//		double varibleComponent = 0;
//		if(this.experince<3) {
//			varibleComponent = 0;
//		}else if(this.experince>=3 && this.experince<5) {
//			varibleComponent = this.basicPay*0.05;
//		}else if(this.experince>=5 && this.experince<10) {
//			varibleComponent = this.basicPay*0.07;
//		}else if(this.experince>=10) {
//			varibleComponent = this.basicPay*0.12;
//		}
//		
//		this.setSalary(basicPay + hra + varibleComponent);
//	}
//    
//    //Uncomment the below method after implementation before verifying 
//    //DO NOT MODIFY THE METHOD
//    /*
//    public String toString(){
//        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
//    }
//    */
//}
//
//class ContractEmployee extends Employee {
//     
//    //Implement your code here 
//	private double wage;
//	private float hoursWorked;
//	public double getWage() {
//		return wage;
//	}
//	public void setWage(double wage) {
//		this.wage = wage;
//	}
//	public float getHoursWorked() {
//		return hoursWorked;
//	}
//	public void setHoursWorked(float hoursWorked) {
//		this.hoursWorked = hoursWorked;
//	}
//	
//	public ContractEmployee(int empid, String name, double wage, float hoursWorked) {
//		super(empid, name);
//		this.wage = wage;
//		this.hoursWorked = hoursWorked;
//	}
//	
//	public void calculateSalary() {
//		this.setSalary(hoursWorked * wage);
//	}
//    
//    //Uncomment the below method after implementation before verifying 
//    //DO NOT MODIFY THE METHOD
//    /*
//    public String toString(){
//        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
//    }
//    */
//}

class Employee {
    
    //Implement your code here 
	
	private int employeeId;
	private String employeeName;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
}


class PermanentEmployee extends Employee {
      
    //Implement your code here 
	private double basicPay;
	private double hra;
	private float experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience ) {
		super(empId, name);
		this.basicPay= basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	
	public void calculateMonthlySalary() {
		float varibleComponent = 0f;
		if(this.experience<3) {
			varibleComponent = 0.0f;
		}else if(this.experience>=3 && this.experience<5) {
			varibleComponent = 5;
		}else if(this.experience>=5 && this.experience<10) {
			varibleComponent =7;
		}else if(this.experience>=10) {
			varibleComponent = 12;
		}
		double x = (float) (basicPay + hra + this.basicPay*(varibleComponent/100));
		this.setSalary(x);
	}
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    //  public String toString(){
    //     return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    // }
}

class ContractEmployee extends Employee {
     
    //Implement your code here 
	private double wage;
	private float hoursWorked;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
		super(empId, name);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
	public void calculateSalary() {
		this.setSalary(hoursWorked * wage);
	}
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
}


class InheritanceAssignment1 {
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
            
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
        
        //Create more objects for testing your code
    }
      
}
