package lab3.Lab3;

public class UPS extends Carrier {
	
	UPS(){
		
	}
	UPS(String name, String zone, double numberOfPound){
		super(name, zone, numberOfPound);
	}
	
	public double getCost(){
		double total = 0.45 * numberOfPound;
		return total;
	}
}
