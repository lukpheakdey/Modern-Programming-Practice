package lab3.Lab3;

public class FedFx extends Carrier{
	
	FedFx(){
		
	}
	
	FedFx(String name, String zone, double numberOfPound){
		super(name, zone, numberOfPound);
	}
	
	public double getCost(){
		double total = 0;
		double rate = 0.0;
		if((zone.equals("IA") || zone.equals("MT") || zone.equals("OR ") || zone.equals("CA"))) {
			rate = 0.35;
		} else if((zone.equals("TX") || zone.equals("UT"))){
			rate = 0.30;
		} else if((zone.equals("FL") || zone.equals("MA") || zone.equals("OH"))){
			rate = 0.55;
		} else {
			rate = 0.43;
		}
		total = rate * numberOfPound;
		return total;
	}

}
