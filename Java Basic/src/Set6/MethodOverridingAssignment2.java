package Set6;

class Event{
    //Implement your code here
	private String eventName;
	private String participantName;
	private double registrationFee;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public Event(String eventName, String participantName) {
		this.eventName = eventName;
		this.participantName = participantName;
	}
	
	public void registerEvent() {
		double fee;
		fee = (this.eventName == "Singing")? 8 : ((this.eventName == "Dancing") ? 10 : 
			((this.eventName == "DigitalArt") ? 12 : ((this.eventName == "Acting") ? 15 : 0 ) ));
		this.setRegistrationFee(fee);
	}
	
}

class SoloEvent extends Event{
    //Implement your code here
	private int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	public SoloEvent(String eventName, String participantName, int participantNo) {
		super(eventName, participantName);
		this.participantNo = participantNo;
	}
	
	public void registerEvent() {
		super.registerEvent();
//		double fee;
//		fee = (this.eventName == "Singing")? 8 : ((this.eventName == "Dancing") ? 10 : 
//			((this.eventName == "DigitalArt") ? 12 : ((this.eventName == "Acting") ? 15 : 0 ) ));
//		this.setRegistrationFee(fee);
	}
}

class TeamEvent extends Event{
    //Implement your code here
	private int noOfParticipants;
	private int teamNo;
	
	
	
	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {
//		double fee;
//		fee = (this.getEventName() == "Singing")? 4 : ((this.getEventName() == "Dancing") ? 6 : 
//			((this.getEventName() == "DigitalArt") ? 8 : ((this.getEventName() == "Acting") ? 10 : 0 ) ));
//		fee = fee * this.noOfParticipants;
//		this.setRegistrationFee(fee);
//		double fee=0;
//		if(this.getNoOfParticipants()>1){
//		if(this.getEventName().equals("Singing")){
//		fee=(double)(this.getNoOfParticipants()*4);
//		this.setRegistrationFee(fee);
//		}
//		else if(this.getEventName().equals("Dancing")){
//		fee=(double)(this.getNoOfParticipants()*6);
//		this.setRegistrationFee(fee);
//		}
//		else if(this.getEventName().equals("DigitalArt")){
//		fee=(double)(this.getNoOfParticipants()*8);
//		this.setRegistrationFee(fee);
//		}
//		else if(this.getEventName().equals("Acting")){
//		fee=(double)(this.getNoOfParticipants()*10);
//		this.setRegistrationFee(fee);
//		}
//		else{
//		this.setRegistrationFee(0);
//		}
	}
}

public class MethodOverridingAssignment2 {
	public static void main(String[] args) {
        
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
