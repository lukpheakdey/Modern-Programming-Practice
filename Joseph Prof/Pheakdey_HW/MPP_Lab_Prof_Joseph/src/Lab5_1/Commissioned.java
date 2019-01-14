package Lab5_1;

import java.time.LocalDate;
import java.util.*;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	
	List<Order> order;

	public Commissioned(String empId, double commission, double baseSalary, List<Order> order) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.order = order;
	}

	@Override
	public double calcGrossPay(int month, int yr) {
		double orderAmountThisMonth = 0.0;
		LocalDate firstCurrentMonth = LocalDate.of(yr, month, 1);
		
		for(Order o : order) {
			if(isPreviousMonth(firstCurrentMonth, o.getOrderDate())) {
				orderAmountThisMonth += o.getOrderAmount();
			}
		}
		return baseSalary + commission * orderAmountThisMonth;
	}
	
	private boolean isPreviousMonth(LocalDate current, LocalDate maybePrevious) {
		int currMonth = current.getMonthValue();
		int prevMonth = maybePrevious.getMonthValue();
		int currYear = current.getYear();
		int prevYear = maybePrevious.getYear();
		if((currMonth - prevMonth == 1 && currYear == prevYear) ||
				(currMonth == 1 && prevMonth == 12 && currYear - prevYear == 1)) {
			return true;
		}
		return false;
	}
	
	
}
