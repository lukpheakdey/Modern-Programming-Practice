package ExtraCredit;

public class HealthPoints extends ACompPoints{
	
	private double points;
	
	public HealthPoints() {
		points=1;
	}

	@Override
	public double getPoints() {
		return points;
	}
}
