package lab3.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<Carrier> carrierList = new ArrayList<Carrier>();
		
		putText("Enter Number of Package : ");
    	int n = getInt();
	
		for(int i = 0; i < n; i++) {
	    	putText("\n\nEnter Package Description : ");
	    	String name = getString();
	    	
	    	putText("\nEnter weight : ");
	    	double weight = getDouble();
	    	
	    	putText("\nEnter Zone : ");
	    	String zone = getString();
	    	
	    	Carrier cUPS = new UPS();
	    	Carrier cUSMail = new USMail();
	    	Carrier cFedFx = new FedFx();
	    
	    	cUPS.setName(name);
	    	cUPS.setNumberOfPound(weight);
	    	cUPS.setZone(zone);
	    	carrierList.add(cUPS);
	    	
	    	cUSMail.setName(name);
	    	cUSMail.setNumberOfPound(weight);
	    	cUSMail.setZone(zone);
	    	carrierList.add(cUSMail);
	    	
	    	cFedFx.setName(name);
	    	cFedFx.setNumberOfPound(weight);
	    	cFedFx.setZone(zone);
	    	carrierList.add(cFedFx);
	    	
	    	Carrier dhl = new DHL();
	    	dhl.setName(name);
	    	dhl.setNumberOfPound(weight);
	    	dhl.setZone(zone);
	    	carrierList.add(dhl);
	    
	    	for(Carrier cc : carrierList) {
	    		System.out.println(" " + cc.getName() +" \t "+ cc.getCost() + "\t " + cc.getClass().getSimpleName());
	    	}
	    	
	    	double lowestPrice = calculateMin(carrierList);
	    	for(Carrier cc : carrierList) {
	    		if(cc.getCost() == lowestPrice){
	    			System.out.println("\n**** The lowest price : ");
	    			System.out.printf("%s \t $%.2f \t %s",cc.getName(), lowestPrice, cc.getClass().getSimpleName());
	    			
	    			putText("\n\nstudent : Student \nsenior : Senior(65 years and above) \nother : Other \n\nEnter Type of Sender :  ");
	    	    	String type = getString();
	    	    	
	    	    	System.out.println("\n**** The lowest price after discount : ");
	    	    	double grandTotalPrice = calculateAfterDiscount(lowestPrice, type);
	    	    	System.out.printf("%s \t $%.2f \t %s",cc.getName(), grandTotalPrice, cc.getClass().getSimpleName());
	    	    	//System.out.printf("%.2f", grandTotalPrice);
	    		}
	    	}	
	    	carrierList.clear();
	    	
		 }  // end for
	} // end main
	
	public static double calculateMin(List<Carrier> carrier) {
		double min = Integer.MAX_VALUE;
		ArrayList<Carrier> data = (ArrayList<Carrier>) carrier;
		
		for(Carrier c : data) {
			double value = c.getCost();
			if(value < min) {
				min = value;
			}
		}
		return min;
	}
	
	public static double calculateAfterDiscount(double lowestPrice, String type) {
		double grandPrice = 0.0;
		String typeofCustomer = type.toLowerCase();
		
		if(typeofCustomer.equals("student")) {
			grandPrice = lowestPrice * 0.90;
		} else if( typeofCustomer.endsWith("senior")) {
			grandPrice = lowestPrice * 0.85;
		} else {
			grandPrice = lowestPrice;
		}
		return grandPrice;
	}
	
	public static void putText(String s) {
    	System.out.println(s);
    }
	
	public static char getChar() throws IOException {
	    String s = getString();
	    return s.charAt(0);
    }
	
	public static String getString() throws IOException {
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    String s = br.readLine();
	    return s;
    }
	
	public static int getInt() throws IOException {
	    String s = getString();
	    return Integer.parseInt(s);
    }
	
	public static double getDouble() throws IOException {
	    String s = getString();
	    return (Double.valueOf(s)).doubleValue();
    }
}
