package Lab7;

import java.util.*;

public class Company {
	
	private String name;
	
	// reference
	private List<Department> department;
	
	Company(String name){
		this.name = name;
		department = new ArrayList<Department>();
	}
	
	public void addDepartment(Department d) {
		department.add(d);
	}
	
	public void print() {
		System.out.println("Company Name : " + name);
		
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
