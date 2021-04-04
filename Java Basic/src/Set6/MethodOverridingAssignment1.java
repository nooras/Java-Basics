package Set6;
class Faculty{
    //Implement your code here
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getBonusPercentage() {
		return bonusPercentage;
	}
	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}
	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
	public Faculty(String name, float basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonusPercentage = 4f;
		this.carAllowancePercentage = 2.5f;
	}
	
	public double calculateSalary() {
		double salary =  this.getBasicSalary()*(1+(this.getBonusPercentage()/100)+(this.getCarAllowancePercentage()/100));    //this.basicSalary + this.bonusPercentage + this.carAllowancePercentage;
		this.setBasicSalary((float)salary);
		return salary;
	}
}

class OfficeStaff extends Faculty{
    //Implement your code here
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
	
	public double calculateSalary() {
		double salary=super.calculateSalary();
		double additionalPay=0;
		if(this.designation.equals("Accountant")) {
			additionalPay = 10000.0;
		}else if(this.designation.equals("Clerk")) {
			additionalPay = 7000.0;
		}else if(this.designation.equals("Peon")) {
			additionalPay = 4500.0;
		}
		salary += additionalPay;
		super.setBasicSalary((float)salary);
		return salary;
	}
	
	
}

class Teacher extends Faculty{
    //Implement your code here
	private String qualification;
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}
	
	public double calculateSalary() {
//		double additionalPay=super.calculateSalary();
//		double teacherSalary=0;
//		if(this.getQualification().equals("Doctoral")){
//		teacherSalary=additionalPay+20000.0;
//		}
//		else if(this.getQualification().equals("Masters")){
//		teacherSalary=additionalPay+18000.0;
//		}
//		else if(this.getQualification().equals("Bachelors")){
//		teacherSalary=additionalPay+15500.0;
//		}
//		else if(this.getQualification().equals("Associate")){
//		teacherSalary=additionalPay+10000.0;
//		}
//		else{
//		teacherSalary=additionalPay;
//		}
//		this.setBasicSalary((float)teacherSalary);
//		return teacherSalary;

		double salary=super.calculateSalary();
		double additionaPay = 0;
		
		additionaPay = (this.qualification.equals("Doctoral"))? 20000.0 : ((this.qualification.equals("Masters")) ? 18000.0: 
			((this.qualification.equals("Bachelors"))?15500.0:((this.qualification.equals("Associate")) ? 10000.0: 0)));
		
		salary += additionaPay;
		super.setBasicSalary((float)salary);
		return salary;
	}
	
	
}

public class MethodOverridingAssignment1 {
public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}
