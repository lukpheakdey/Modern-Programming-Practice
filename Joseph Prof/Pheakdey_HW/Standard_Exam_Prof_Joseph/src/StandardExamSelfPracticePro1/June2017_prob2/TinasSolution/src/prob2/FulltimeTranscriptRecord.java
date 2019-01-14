package prob2;

public class FulltimeTranscriptRecord {

	private SemesterTranscript fallTranscript;

	private SemesterTranscript springTranscript;

	public SemesterTranscript getFallTranscript() {
		return fallTranscript;
	}

	public void setFallTranscript(SemesterTranscript fallTranscript) {
		this.fallTranscript = fallTranscript;
	}

	public SemesterTranscript getSpringTranscript() {
		return springTranscript;
	}

	public void setSpringTranscript(SemesterTranscript springTranscript) {
		this.springTranscript = springTranscript;
	}

}
