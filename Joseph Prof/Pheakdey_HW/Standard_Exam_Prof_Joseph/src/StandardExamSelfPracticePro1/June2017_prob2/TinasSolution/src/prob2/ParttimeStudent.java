package prob2;

public class ParttimeStudent extends Student {
	private ParttimeTranscriptRecord record;

	public ParttimeStudent(String name, ParttimeTranscriptRecord record) {
		super(name);
		this.record = record;
	}

	@Override
	public double computeGpa() {
		return record.getGrades().stream().mapToDouble(d -> d).average().getAsDouble();
	}
}
