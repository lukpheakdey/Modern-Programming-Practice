package lab3.lab3_1_And_3_2;

import java.util.*;

public class Company {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	// reference
	public List<Department> department;
	
	public Company(String name){
		this.name = name;
		department = new ArrayList<Department>();
	}
	
	public void addDepartment(Department d) {
		department.add(d);
	}
	
	public void print() {
		System.out.println("Company Name : " + getName());
		
		for(Department dep : department) {
			System.out.println("Department : " + dep.getName());
			dep.print();
		}		
	}
	
	public double getSalary() {
		double sum = 0.0;
		for(Department d : department) {
			sum += d.getSalary();
		}
		return sum;
	}
	
}
