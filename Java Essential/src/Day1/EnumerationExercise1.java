package Day1;


//defining enum Grade
enum Grade{
	A,B,C,D,E;
}

class Student1{
	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;
	//Grade is the name of enum
	
	private float scholarshipAmount;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScolarshipAmount() {
		return scholarshipAmount;
	}
	public void setScolarshipAmount(float scolarshipAmount) {
		this.scholarshipAmount = scolarshipAmount;
	}
	
	public void calculateGrade() {
	/*
	    write the logic to calculate the grade of the student
	*/
		if(this.getTotalMarks() >= 250) {
			this.setGrade(Grade.A);
		}else if(this.getTotalMarks() >= 200 && this.getTotalMarks() < 250) {
			this.setGrade(Grade.B);
		}else if(this.getTotalMarks() >= 175 && this.getTotalMarks() < 200) {
			this.setGrade(Grade.C);
		}else if(this.getTotalMarks() >= 150 && this.getTotalMarks() < 175) {
			this.setGrade(Grade.D);
		}else {
			this.setGrade(Grade.E);
		}
	}
	
	public void calculateScolarshipAmount() {
	/*
	    write the logic to calculate scholarship amount based on grade 
	*/
		if(this.getGrade()==Grade.A) {
			this.setScolarshipAmount(5000);
		}else if(this.getGrade()==Grade.B) {
			this.setScolarshipAmount(4000);
		}else if(this.getGrade()==Grade.C) {
			this.setScolarshipAmount(3000);
		}else if(this.getGrade()==Grade.D) {
			this.setScolarshipAmount(2000);
		}else {
			this.setScolarshipAmount(0);
		}
	}
}

class EnumerationExercise1 {
 public static void main(String[] args) {
	Student1 student = new Student1();
    student.setStudentId(1000);
    student.setName("Alvin");
    student.setTotalMarks(280);
    student.calculateGrade();
    student.calculateScolarshipAmount();
    System.out.println("Student Details");
    System.out.println("***************");
    System.out.println("Student Id : "+student.getStudentId());
    System.out.println("Name : "+student.getName());
    System.out.println("Grade : "+student.getGrade());
    System.out.println("Scholarship Amount : "+student.getScolarshipAmount());
    
 }
}

