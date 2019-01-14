package StandardExamSelfPracticePro1.May2017_prob2;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		for(LibraryMember member : members) {
			for(CheckoutRecordEntry record : member.getCheckoutRecord().getCheckEntryList()) {
				if(record.getLendingItem().equals(item)) {
					phoneNums.add(member.getPhone());
					break;
				}
			}
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
