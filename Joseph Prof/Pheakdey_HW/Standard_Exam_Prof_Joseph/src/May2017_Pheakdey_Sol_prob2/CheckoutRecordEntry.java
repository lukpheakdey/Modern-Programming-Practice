package May2017_Pheakdey_Sol_prob2;

import java.time.*;

public class CheckoutRecordEntry {
	
	private LendingItem leadingItem;
	private ItemType itemType;
	
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public LendingItem getLeadingItem() {
		return leadingItem;
	}
	
	public ItemType getLeadingItemType() {
		return itemType;
	}
	
	CheckoutRecordEntry(LendingItem leadingItem, LocalDate chDate, LocalDate dueDate, ItemType itemType){
		this.leadingItem = leadingItem;
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.itemType = itemType;
	}
	
	
	
	
}
