package StandardExamSelfPracticePro1.June2017_prob2.Exam.prob2_Sol;

import java.util.ArrayList;
import java.util.List;

public class SemesterTranscript {
	
	private List<Double> grades = new ArrayList<Double>();
	
	public List<Double> getGrades(){
		return grades;
	}
	
	public void insertGrade(double grade) {
		grades.add(grade);
	}
}
