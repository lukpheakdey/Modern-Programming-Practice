package prob2;

import java.util.List;

public class FulltimeStudent extends Student {
	
	private FulltimeTranscriptRecord record;
	public FulltimeStudent(String name, FulltimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}
	@Override
	public double computeGpa() {
		List<Double> fallGrades = record.getFallTranscript().getGrades();
		List<Double> springGrades = record.getSpringTranscript().getGrades();
		if(fallGrades.isEmpty() && springGrades.isEmpty()) return 0.0;
		double sum = 0.0;
		for(Double d : fallGrades) {
			sum += d.doubleValue();
		}
		for(Double d : springGrades) {
			sum += d.doubleValue();
		}
		return sum / (fallGrades.size() + springGrades.size());
	}
	
}
