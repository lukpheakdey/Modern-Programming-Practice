package StandardExamSelfPracticePro1.March2018_1.prob2;

public class Student {
	
	private String firstName;
	private String lastName;
	
	private PlanOfStudy planOfStudy;
	private Transcript transcript;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		planOfStudy = new PlanOfStudy();
		transcript = new Transcript();
		
	}

	public String getFirstName() {
		return firstName;
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
