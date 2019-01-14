package StandardExamSelfPracticePro1.March2018_1.prob2;
import java.time.*;
public class TranscriptEntry {
	
	private LocalDate dateTaken;
	private String grade;
	
	Course cours;
	
	public TranscriptEntry(LocalDate dateTaken, String grade, Course course){
		this.dateTaken = dateTaken;
		this.grade = grade;
		this.cours = course;
	}

	public LocalDate getDateTaken() {
		return dateTaken;
	}

	public String getGrade() {
		return grade;
	}

	public Course getCours() {
		return cours;
	}

	public void setDateTaken(LocalDate dateTaken) {
		this.dateTaken = dateTaken;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setCours(Course cours) {
		this.cours = cours;
	}

	
}
