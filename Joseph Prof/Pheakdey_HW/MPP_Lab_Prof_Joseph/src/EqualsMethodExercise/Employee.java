package EqualsMethodExercise;

import java.util.Date;
import java.util.*;

public class Employee {

	private String name;
	private double salary;
	private Date dob;
	
	BankAccount b1;
	List<BankAccount>  accounts;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		BankAccount b2;
		if(obj == null) 
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		b2 = (BankAccount)obj;
		
		if(this.name == null && b2.name!=null)
			return false;
		if(!this.name.equals(b2.name))
			return false;
		return true;
		 
		//return this.name.equals(b2.name);
	}
	
	
	
}
