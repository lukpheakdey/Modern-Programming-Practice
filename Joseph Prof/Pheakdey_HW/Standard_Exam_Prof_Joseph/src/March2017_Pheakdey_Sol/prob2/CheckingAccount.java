package March2017_Pheakdey_Sol.prob2;

public class CheckingAccount extends Account{

	private double balance;
	private double montlyFee;
	private String acctId;
	
	CheckingAccount(String acctId, double fee, double startBalance){
		this.acctId = acctId;
		this.montlyFee = fee;
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
		updateBalance =	balance - montlyFee;
		return updateBalance;
	}
	
	
	
}
