package May2017_Pheakdey_Sol_prob2;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		
//		for(LibraryMember member : members) {
//			for(CheckoutRecordEntry checkoutRecord : member.getCheckoutRecord().getCheckoutEntryList()) {
//				if(checkoutRecord.getLeadingItem().equals(item)) {
//					phoneNums.add(member.getPhone());
//					break;
//				}
//			}
//		}
//		Collections.sort(phoneNums);
		
		for(LibraryMember member : members) {
			for(CheckoutRecordEntry c : member.getCheckoutRecord().getCheckoutEntryList()) {
				if(c.getLeadingItem().equals(item)) {
					phoneNums.add(member.getPhone());
					break;
				}
			}
				
		}
		return phoneNums;
	}

//	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
//		List<String> phoneNums = new ArrayList<>();
//		for(LibraryMember member : members) {
//			for(CheckoutRecordEntry checkoutRecord : member.getCheckoutRecord().getCheckoutEntryList()) {
//				if(checkoutRecord.getLeadingItem().equals(item)) {
//					phoneNums.add(member.getPhone());
//					break;
//				}
//			}
//		}
//		return phoneNums;
//	}
}
