package lab2;

import java.util.*;

public class Student extends Person {
	
	private double gpa;
	
	private List<Course> course;
	
	public double getTotalUnits() {
		return 0.0;
	}
	
	Student(String name, String phone, int age, double gpa){
		super(name, phone, age);
		this.gpa = gpa;
	}
	
	

}
