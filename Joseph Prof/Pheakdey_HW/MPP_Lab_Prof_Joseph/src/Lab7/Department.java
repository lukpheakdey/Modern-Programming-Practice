package Lab7;

import java.util.*;

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
	
	public double getSalary() {
		double result = 0.0;
		for(Position p : position) {
			result += p.getSalary();
		}
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Department dep = (Department)obj;
		
		if(this.name == null && dep.name != null)
			return false;
		if(this.location == null && dep.location != null)
			return false;
		
		if((!this.location.equals(dep.location)) || (!this.name.equals(dep.name)))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Department Information : \n" + "Department Name : " + name + " Location : " + location;
	}
	
	

}
