package ExtraCredit;

public class ComputerPoints extends ACompPoints{
	
	private double points;
	public ComputerPoints() {
		points=2;
	}

	@Override
	public double getPoints() {
		return points;
	}
}
