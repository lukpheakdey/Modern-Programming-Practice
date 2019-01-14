package LambdaStreamLab.lab3_1_And_3_2LambdaStream;

import java.util.*;
import java.util.stream.Collectors;

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
	
	//Using Stream
	public void printWithStream() {
		department.stream()
				.map(d -> d.getName())
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
	
	public double getSalary() {
		double sum = 0.0;
		for(Department d : department) {
			sum += d.getSalary();
		}
		return sum;
	}
	
	//Using Stream
	public double getSalaryStream() {
		double sum = department.stream()
				.mapToDouble(d->d.getSalary())
				.reduce(0,(s1, s2)-> s1+s2);
		return sum;
	}
	

}
