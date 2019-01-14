package StandardExamSelfPracticePro1.May2017_prob2;
import java.time.*;

public class CheckoutRecordEntry {
	
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	LendingItem item;
	ItemType type;
	
	CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type){
		this.item = item;
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.type = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LendingItem getLendingItem () {
		return item;
	}

	public ItemType getLendingItemType() {
		return type;
	}
}
