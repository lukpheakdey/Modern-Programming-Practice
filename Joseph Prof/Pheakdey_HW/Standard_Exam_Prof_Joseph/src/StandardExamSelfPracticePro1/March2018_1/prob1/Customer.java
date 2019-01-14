package StandardExamSelfPracticePro1.March2018_1.prob1;

public class Customer {
	private String custId;
	private String firstName;
	private String lastName;
	private Account checkingAccount;
	private Address address;
	
	public Customer(String custId, String fname, String lname) {
		this.custId = custId;
		this.firstName = fname;
		this.lastName = lname;
		createNewAccount();
	}
	
	public void addAddress(Address addr) {
		address = addr;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void createNewAccount() {
		checkingAccount = new Account(0.0, this);
	}
	
	public void makeDeposit(double amount) {
		checkingAccount.updateBalance(amount);
	}
	public void makeWithDrawal(double amount) {
		checkingAccount.updateBalance(-amount);
	}

	public String getCustId() {
		return custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public Account getCheckingAccount() {
		return checkingAccount;
	}
	
	@Override
	public String toString() {
		return custId + ": " + firstName + " " + lastName;
	}
}
