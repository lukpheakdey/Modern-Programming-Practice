package March2017_Pheakdey_Sol.prob2;

public class SavingsAccount extends Account {
	
	private double balance;
	private double interestRate;
	private String acctId;
	
	SavingsAccount(String acctId, double interestRate, double startBalance){
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}
	
	
	public String getAccountID() {
		return acctId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double computeUpdateBalance() {
		double updateBalance = 0.0;
		updateBalance =	balance + (interestRate * balance);
		return updateBalance;
	}
	

}
