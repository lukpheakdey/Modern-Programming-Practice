package lab3.lab3_3;

import java.util.*;

public class Department {

	public ArrayList<Position> positions;
	
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
		positions = new ArrayList<Position>();
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	private String location;

	public void print(){
		System.out.println("	Department: " + getName() + " Location: " + getLocation());
		positions.forEach(x-> 
		{
			x.print();
		});
	}
	
	double totalSalary;
	public double getSalary(){
		totalSalary = 0;
		positions.forEach(x-> 
		{
			totalSalary = totalSalary + x.getSalary();
		});
		return totalSalary;
	}
	
	// Lab3_3
	public void printReportingHierarchy(){
		System.out.println("	Department: " + getName() + " Location: " + getLocation());
		positions.forEach(x-> 
		{
			if (getDepartmentHead().equals(x)){
			   x.print();
			   x.printdownline();
			}
		});
		
	}
	
	Position departmentHead = null;
	public Position getDepartmentHead(){
		positions.forEach(x-> 
		{
			if (x.isDepartmentHead == true){
				departmentHead =  x;
			}
		});
		return departmentHead;
	}

}

