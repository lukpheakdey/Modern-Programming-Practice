package StandardExamSelfPracticePro1.March2017_prob2.prob2;

public class CheckingAccount extends Account {
	
	private double balance;
	private double monthlyFee;
	private String acctId;
	
	CheckingAccount(String acctId, double fee, double startBalance){
		this.acctId = acctId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}
	
	public String getAccountID() {
		return acctId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}

}
