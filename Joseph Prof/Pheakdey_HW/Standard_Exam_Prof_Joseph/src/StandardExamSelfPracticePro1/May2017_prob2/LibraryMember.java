package StandardExamSelfPracticePro1.May2017_prob2;

public class LibraryMember {
	
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	
	CheckoutRecord checkoutRecord;
	
	public String getMemberId() {
		return memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}

	LibraryMember(String memberId, String fname, String lname, String phone){
		this.memberId = memberId;
		this.firstName = fname;
		this.lastName = lname;
		this.phone = phone;
	}
	
}
