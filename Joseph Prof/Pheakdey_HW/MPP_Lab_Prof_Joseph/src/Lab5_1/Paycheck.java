package Lab5_1;

import java.util.*;

public final class Paycheck {
	
	private double grossPay;

	private final Tax fica;
	private final Tax state;
	private final Tax local;
	private final Tax medicare;
	private final Tax ssn;
	
	private final Employee emp;
	
	Paycheck(Employee emp, double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax ssn){
		this.emp = emp;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.ssn = ssn;
	}
	
	public void print() {
		System.out.println(this);
		
	}
	
	public double getNetPay() {
		return grossPay - grossPay * fica.getVal()
						- grossPay * state.getVal()
						- grossPay * local.getVal()
						- grossPay * medicare.getVal()
						- grossPay * ssn.getVal();
	}
		
	@Override
	public String toString() {
		return "Pay for : " + emp.getEmpId() + "\n"
				+ "Gross Pay : " + String.format("$ %.2f", grossPay) + "\n"
				+ "FICA : " + String.format("%.0f%%", fica.getVal()*100) + "\n"
				+ "State : " + String.format("%.0f%%", state.getVal()*100) + "\n"
				+ "Local : " + String.format("%.0f%%",local.getVal()*100) + "\n"
				+ "Medicare : " + String.format("%.0f%%", medicare.getVal()*100) + "\n"
				+ "Soical Security : " + String.format("%.1f%%", ssn.getVal()*100) +"\n"
				+ "Net Pay : " + String.format("$ %.2f", getNetPay()) +"\n\n"; 
	}

}

