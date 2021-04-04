package DaySixExercise;

abstract class Student{
    //Implement your code here
	private String studentName;
	private int[] testScores;
	private String testResult;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScore(int testNumber, int testScore) {
		this.testScores[testNumber] = testScore;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	public Student(String studentName) {
		this.studentName = studentName;
		this.testScores = new int[4];
	}
	
	public abstract void generateResult();
	
	
}

class UndergraduateStudent extends Student{
    //Implment your code here
	
	public UndergraduateStudent(String studentName) {
		super(studentName);
	}
	
	public void generateResult() {
		int[] x = super.getTestScores();
		double avg = 0;
		for(int i=0; i<x.length; i++) {
			avg += x[i];
		}
		avg = avg/x.length;
		if(avg >= 60) {
			this.setTestResult("Pass");
		}else if(avg < 60) {
			this.setTestResult("Fail");
		} 
	}
}

class GraduateStudent extends Student{
    //Implment your code here
	public GraduateStudent(String studentName) {
		super(studentName);
	}
	public void generateResult() {
		int[] x = super.getTestScores();
		double avg = 0;
		for(int i=0; i<x.length; i++) {
			avg += x[i];
		}
		avg = avg/x.length;
		if(avg >= 70) {
			this.setTestResult("Pass");
		}else if(avg < 70) {
			this.setTestResult("Fail");
		} 
	}
}

public class AbstractExercise1 {
	public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
