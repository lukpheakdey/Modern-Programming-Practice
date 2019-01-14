package StandardExamSelfPracticePro1.March2018.prob2;

public class Student {

	private String fistName;
	private String lastName;
	
	private PlanOfStudy planOfStudy;
	private Transcript transcript;
	
	public Student(String firstName, String lastName){
		this.fistName = firstName;
		this.lastName = lastName;
		
		planOfStudy = new PlanOfStudy();
		transcript = new Transcript();
	}

	public String getFistName() {
		return fistName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public PlanOfStudy getPlanOfStudy() {
		return planOfStudy;
	}
	
	public Transcript getTranscript() {
		return transcript;
	}
	
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPlanOfStudy(PlanOfStudy planOfStudy) {
		this.planOfStudy = planOfStudy;
	}
	
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	
	
	
}
