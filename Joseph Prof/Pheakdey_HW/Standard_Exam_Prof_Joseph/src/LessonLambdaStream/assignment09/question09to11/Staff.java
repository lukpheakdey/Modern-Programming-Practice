package assignment09.question09to11;

import java.util.*;

public class Staff  extends Person implements IStaff {

	public Staff()
	{
		
	}

	public Staff(String name, String phone, int age, double salary) {
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		setSalary(salary);
		setType("staff");
	}
	
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	private double salary;
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	


	

	
	
	
}
