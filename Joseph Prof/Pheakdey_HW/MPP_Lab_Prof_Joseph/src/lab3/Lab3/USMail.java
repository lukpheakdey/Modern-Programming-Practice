package lab3.Lab3;

public class USMail extends Carrier {
	
	USMail(){
		
	}

	USMail (String name, String zone, double numberOfPound){
		super(name, zone, numberOfPound);
	}
	
	public double getCost(){
		double total = 0;
		if(numberOfPound > 3) {
			total = numberOfPound * 0.55;
		} else {
			total = numberOfPound * 1;
		}
		return total;
	}
}
