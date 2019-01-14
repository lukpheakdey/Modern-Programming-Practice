package Lab5_1;

import java.time.LocalDate;
import java.time.*;

public abstract class Employee {

	private String empId;
	
	Employee(String empId){
		this.empId = empId;
	}
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public abstract double calcGrossPay(int month, int year);
	
	public void print() {
		LocalDate now = LocalDate.of(2018, 10, 01);
		Paycheck payCheck = calsCompensation(now.getMonthValue(), now.getYear());
		payCheck.print();
	}
	
	public Paycheck calsCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(this, grossPay, Tax.FICA, Tax.State, Tax.Local, Tax.Medicare, Tax.SSN);
	}
	
}
