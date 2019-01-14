package prob2;
import java.util.*;
public class ParttimeStudent extends Student {
	
	private ParttimeTranscriptRecord record;
	public ParttimeStudent(String name, ParttimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}
	@Override
	public double computeGpa() {
		List<Double> grades = record.getGrades();
		if(grades.isEmpty()) return 0.0;
		double sum = 0.0;
		for(Double d : grades) {
			sum += d.doubleValue();
		}
		return sum / grades.size();
	}
	
}
