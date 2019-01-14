package LambdaStreamLab.schoolLab;

public class Course {
	
	private String number;
	private String title;
	private int unirs;

	private Person person;
	
	public Course(String number, String title, int unirs, Person person){
		this.number = number;
		this.title = title;
		this.unirs = unirs;
		this.person = person;
	}
	
	public int getUnit() {
		return unirs;
	}
	
	public void setUnit() {
		this.unirs = unirs;
	}

}
