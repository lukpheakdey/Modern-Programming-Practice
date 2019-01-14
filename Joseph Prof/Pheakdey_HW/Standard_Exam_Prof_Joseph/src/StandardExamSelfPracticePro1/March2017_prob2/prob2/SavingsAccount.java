package StandardExamSelfPracticePro1.March2017_prob2.prob2;

public class SavingsAccount extends Account{
	
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
	
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}

}
