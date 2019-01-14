package Lab5_1;

public class Salaried extends Employee {

	private double salaried;

	public Salaried(String empId, double salaried) {
		super(empId);
		this.salaried = salaried;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return salaried;
	}

}
