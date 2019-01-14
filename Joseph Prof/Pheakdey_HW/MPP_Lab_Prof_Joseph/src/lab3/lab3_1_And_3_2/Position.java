package lab3.lab3_1_And_3_2;

import java.util.*;
import java.util.ArrayList;

import lab3.lab3_3.Department;

public class Position {
	
	private String title;
	private String description;
	
	public Employee employee;
	public Department department;
	
	Position(String title, String description){
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void print() {
		employee.print();
	}

	public double getSalary() {
		return employee.getSalary();
	}
	
	public void setEmployee(Employee emp) {
		employee = emp;
	}

}
