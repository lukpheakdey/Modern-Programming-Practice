package StandardExamSelfPracticePro1.June2017_prob2.Exam.prob2_Sol;

import java.util.List;

public class FulltimeStudent extends Student {
	
	FulltimeTranscriptRecord record;
	
	FulltimeStudent(String name, FulltimeTranscriptRecord record){
		super(name);
		this.record = record;
	}
	
	public double computeGpa() {
		double result = 0.0;
		
		List<Double> fallGrades = record.fallTranscript.getGrades();
		List<Double> springGrades = record.springTranscript.getGrades();
		
		for(Double f : fallGrades) {
			result += f.doubleValue();
		}
		
		for(Double s : springGrades) {
			result += s.doubleValue();
		}
		
		return result/(fallGrades.size()+springGrades.size());
	}
	
}
