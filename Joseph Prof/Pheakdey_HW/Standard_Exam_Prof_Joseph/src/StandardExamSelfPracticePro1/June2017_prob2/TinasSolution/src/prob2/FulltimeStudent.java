package prob2;

import java.util.List;

public class FulltimeStudent extends Student{

	private FulltimeTranscriptRecord record;

	public FulltimeStudent(String name, FulltimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}

	@Override
	public double computeGpa() {
		
		List<Double> fallGrades = record.getFallTranscript().getGrades();
		List<Double> springGrades = record.getSpringTranscript().getGrades();
		fallGrades.addAll(springGrades);
		return fallGrades.stream().mapToDouble(d -> d).average().getAsDouble();
	}

}
