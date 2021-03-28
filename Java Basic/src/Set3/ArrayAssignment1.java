package Set3;

class Teacher{
	private String techerName;
	private String subject; 
	private double salary;
	public String getTecherName() {
		return techerName;
	}
	public void setTecherName(String techerName) {
		this.techerName = techerName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Teacher(String teacherName, String subject, double salary) {
		this.setTecherName(teacherName);
		this.setSubject(subject);
		this.setSalary(salary);
	}
}

public class ArrayAssignment1 {
	public static void main(String[] args) {
	 Teacher t[]= new Teacher[4];
	 t[0] = new Teacher("Nooras", "Maths", 50000);
	 t[1] = new Teacher("Rishi", "Maths2", 55000);
	 t[2] = new Teacher("Praful", "Physics", 60000);
	 t[3] = new Teacher("Saurabh", "Chemistry", 65000);
	 for(int i=0; i<t.length;i++) {
		 System.out.println("Teacher Name: " +t[i].getTecherName());
		 System.out.println("Subject: " +t[i].getSubject());
		 System.out.println("Salary: " +t[i].getSalary());
		 System.out.println("---------");
	 }
	}
}
