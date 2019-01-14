package March2017_Pheakdey_Sol.prob2;

import java.util.*;

public class Employee {
	
	Account acc;
	
	List<Account> account; 
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	Employee(String name){
		this.name = name;
		account = new ArrayList<Account>();
	}
	
	public void addAccount(Account acc) {
		account.add(acc);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement 
		//done;
		double sum = 0.0;
		for(Account a : account) {
			sum += a.computeUpdateBalance();
		}
		return sum;
	}
}
