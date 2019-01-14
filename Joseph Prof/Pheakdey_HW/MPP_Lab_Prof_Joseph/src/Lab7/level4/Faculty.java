package Lab7.level4;

import java.util.*;

public class Faculty extends Person{
	
	private double salary;
	
	private List<Course> course;
	
	public double getSalary() {
		return salary;
	}
	
	public Faculty(String name, String phone, int age, double salary){
		super(name, phone, age);
		this.salary = salary;
		course = new ArrayList<Course>();
	}
	
	public int getTotalUnits() {
		int sum = 0;
		for(Course c : course) {
			sum = sum + c.getUnit();
		}
		return sum;
	}
	
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public List<Course> getCourse(){
		return course;
	}
	public void addCourse(Course c) {
		course.add(c);
	}
	
}
