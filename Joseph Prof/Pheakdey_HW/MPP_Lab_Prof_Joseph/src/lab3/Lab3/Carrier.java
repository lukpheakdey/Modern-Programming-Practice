package lab3.Lab3;

public class Carrier {
	
	public double numberOfPound;
	public String name;
	public String zone;
	public double cost;
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	Carrier(){
		
	}
	
	Carrier(String name, String zone, double numberOfPound){
		this.name = name;
		this.zone = zone;
		this.numberOfPound = numberOfPound;
	}

	public double getNumberOfPound() {
		return numberOfPound;
	}

	public void setNumberOfPound(double numberOfPound) {
		this.numberOfPound = numberOfPound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
