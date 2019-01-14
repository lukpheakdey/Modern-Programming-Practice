package LambdaStreamLab.lab3_1_And_3_2LambdaStream;

import java.util.*;
import java.util.stream.Collectors;

public class Department {
	
	private String name;
	private String location;
	
	
	// reference
	private List<Position> position;
	//public Company company;
	
	Department(String name, String location){
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
	
	// Using Stream
	public void printUsingStream() {
		position.forEach( p -> {
			p.print();
		});
	}
	
	public double getSalary() {
		double result = 0.0;
		for(Position p : position) {
			result += p.getSalary();
		}
		return result;
	}


}
