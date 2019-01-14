package StandardExamSelfPracticePro1.March2017_prob2.prob2;
import java.util.*;
public class Employee {
	
	private String name;
	List<Account> account;
	
	Employee(String name){
		this.name = name;
		account = new ArrayList<Account>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		account.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double result = 0.0;
		for(Account a : account) {
			result += a.computeUpdatedBalance();
		}
		return result;
	}
}
