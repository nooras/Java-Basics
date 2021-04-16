package Day1;

class Student {
	private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student change() {
        //Write your code here to implement the logic
		
		if(this.middleName.isBlank()) {
			this.middleName = "N.A.";
		}
		this.firstName = this.firstName.strip();
		this.lastName = this.lastName.strip();
		this.middleName = this.middleName.strip();
		
		return this;
	}
	public String generateInitials() {
        //Write your code here to implement the logic
		
		Student s = new Student();
		s = change();
		String fml = "" + s.firstName.charAt(0) + s.middleName.charAt(0) + s.lastName.charAt(0);
		return fml;
		
	}


}
public class StringExercise2 {
	
	public static void main(String[] args) {
	
		Student std1=new Student();
		std1.setFirstName("Filius  ");
		std1.setMiddleName(" ");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());
		
		
	}
}
