package assignment09.question09to11;

import java.util.ArrayList;

public class Faculty extends Person  {

	public Faculty(String name, String phone, int age, double salary) {
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
		setSalary(salary);
		setType("faculty");
		}
		
		private String type;
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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
	
	public ArrayList<Course> courses = new ArrayList<Course>();
	public void AddCourse(Course c)
	{
		courses.add(c);
	}
	

}
