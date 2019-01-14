package May2017_Pheakdey_Sol_prob2;

import java.util.*;

public class CheckoutRecord {
	
	List<CheckoutRecordEntry> checkoutRecordEntry;
	
	CheckoutRecord(){
		checkoutRecordEntry = new ArrayList<CheckoutRecordEntry>();
	}
	
	public List<CheckoutRecordEntry> getCheckoutEntryList(){
		return checkoutRecordEntry;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutRecordEntry.add(entry);
	}
	
}
