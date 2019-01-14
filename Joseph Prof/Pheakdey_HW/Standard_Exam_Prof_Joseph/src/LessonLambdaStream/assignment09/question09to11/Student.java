package assignment09.question09to11;

import java.util.ArrayList;

public class Student  extends Person {
	
	public Student(String name, String phone, int age, double gpa) {
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		setGpa(gpa);
		setType("student");
	}
	
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	
	public ArrayList<Course> courses = new ArrayList<Course>();
	public void AddCourse(Course c)
	{
		courses.add(c);
	}
	
	
	private int totalUnits;
	public int getTotalUnits()
	{
		
		return totalUnits;
	}
	
	
	public void setTotalUnits(int totalUnits)
	{
		this.totalUnits = totalUnits;
	}
	
}
