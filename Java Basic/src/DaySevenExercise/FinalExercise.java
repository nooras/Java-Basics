package DaySevenExercise;

class Students{
    //Implement your code here
	private final int STIPEND = 100;
	private int studentId;
	private int aggregateMarks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}

	public double calculateTotalStipend() {
		double s =this.getSTIPEND();
		if(this.aggregateMarks>=85  && this.aggregateMarks<90)
			s += 10;
		else if(this.aggregateMarks>=90  && this.aggregateMarks<95)
			s += 15;
		else if(this.aggregateMarks>=95  && this.aggregateMarks<=100)
			s += 20;
		
		return s;
	}
}

public class FinalExercise {
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Students student2 = new Students();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}
