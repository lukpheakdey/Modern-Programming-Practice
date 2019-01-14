package StandardExamSelfPracticePro1.March2018_1.prob1;

public class Account {
	
	private String id;
	private Customer customer;
	Account(double newBalance, Customer c) {
		balance = newBalance;
		customer = c;
	}
	private double balance = 0.0;
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	public Customer getCustomer(){
		return customer;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public static int currentAcctNumber = 100;
}
