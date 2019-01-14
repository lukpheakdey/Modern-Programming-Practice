package May2017_Pheakdey_Sol_prob2;

public class LibraryMember {
	
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	
	private CheckoutRecord checkoutRecord;
	
	LibraryMember(String id, String fname, String lname, String phone){
		this.memberId = id;
		this.firstName = fname;
		this.lastName = lname;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
}
