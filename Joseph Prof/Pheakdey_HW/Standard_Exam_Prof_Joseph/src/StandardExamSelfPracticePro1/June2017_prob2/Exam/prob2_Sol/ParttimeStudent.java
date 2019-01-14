package StandardExamSelfPracticePro1.June2017_prob2.Exam.prob2_Sol;
import java.util.*;

public class ParttimeStudent extends Student{
	
	ParttimeTranscriptRecord record;
	
	ParttimeStudent(String name, ParttimeTranscriptRecord record){
		super(name);
		this.record = record;
	}
	
	public double computeGpa() {
		List<Double> grades = record.getGrades();
		double resultGpa = 0.0;
		for(Double g : grades) {
			resultGpa += g.doubleValue();
		}
		return resultGpa/grades.size();
	}
	
}
