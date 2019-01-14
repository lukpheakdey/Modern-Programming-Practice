package prob2;

import java.util.*;

public class ParttimeTranscriptRecord {
	public List<Double> grades;

	public ParttimeTranscriptRecord() {
		grades = new ArrayList<>();
	}

	public List<Double> getGrades(){
		return grades;
	}
	
	public void insertGrade(Double grade) {
		grades.add(grade);
	}
}
