package StandardExamSelfPracticePro1.May2017_prob2;
import java.util.*;

public class CheckoutRecord {
	
	List<CheckoutRecordEntry> checkRecordEntry = new ArrayList<CheckoutRecordEntry>();
	
	
	public List<CheckoutRecordEntry> getCheckEntryList(){
		return checkRecordEntry;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkRecordEntry.add(entry);
	}
	
}
