package lab3.Lab3;

public class DHL extends Carrier{
	
	DHL(){
		
	}

	DHL(String name, String zone, double numberOfPound){
		super(name, zone, numberOfPound);
	}
	
	public double getCost(){
		double total = 0.10 * numberOfPound;
		return total;
	}
}
