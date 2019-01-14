package lab3.lab3_1_And_3_2;

import java.util.*;

public class Department {
	
	private String name;
	private String location;
	
	
	// reference
	public List<Position> position;
	//public Company company;
	
	public Department(String name, String location){
		this.name = name;
		this.location = location;
		
		position = new ArrayList<Position>();
	}
	
	public void addPosition(Position p) {
		position.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void print() {
		for(Position p : position) {
			System.out.println("\tTitle : " + p.getTitle() + " , Description : " + p.getDescription());
			p.print();
			System.out.println();
		}
	}
	
	public double getSalary() {
		double result = 0.0;
		for(Position p : position) {
			result += p.getSalary();
		}
		return result;
	}
}
