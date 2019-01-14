package StandardExamSelfPracticePro1.March2018.prob2;

import java.util.*;
import java.time.*;
import java.util.Arrays;

public class Transcript {
	
	List<TranscriptEntry> transcriptEntry;
	
	Transcript() {
		transcriptEntry = new ArrayList<TranscriptEntry>();
	}
	
	public List<TranscriptEntry> getTranscriptEntries(){
		return transcriptEntry;
	}
	
	public void addTranscriptEntry(LocalDate courseDate, String grade, Course course) {
		transcriptEntry.add(new TranscriptEntry(courseDate, grade, course));
	}
	
}
