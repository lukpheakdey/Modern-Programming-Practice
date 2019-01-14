package Lab5_1;


public class Hourly extends Employee {
	
	private double hourlyWage;
	private int hoursPerWeek;
	
	public final int WEEK_PER_MONTH = 0;
	
	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	
	@Override
	public double calcGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek * WEEK_PER_MONTH;
	}

}
