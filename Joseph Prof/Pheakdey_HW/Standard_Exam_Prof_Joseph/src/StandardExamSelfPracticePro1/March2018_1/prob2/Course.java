package StandardExamSelfPracticePro1.March2018_1.prob2;

public class Course {
	
	private String courseTitle;
	private String primaryProfessor;
	
	public Course(String title, String professor) {
		this.courseTitle = title;
		this.primaryProfessor = professor;
	}
	
	@Override
	public String toString() {
		/* uncomment when ready */
		return courseTitle + ": " + primaryProfessor;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public String getPrimaryProfessor() {
		return primaryProfessor;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setPrimaryProfessor(String primaryProfessor) {
		this.primaryProfessor = primaryProfessor;
	}
	
	
}
