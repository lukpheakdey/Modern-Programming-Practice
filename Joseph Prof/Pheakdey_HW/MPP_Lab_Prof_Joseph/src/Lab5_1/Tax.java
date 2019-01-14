package Lab5_1;

public enum Tax {
	FICA(.25),
	State(.05),
	Local(.01),
	Medicare(0.03),
	SSN(0.075);
	
	private double val;
	
	private Tax(double val) {
		this.val = val;
	}
	
	public double getVal() {
		return val;
	}
}
