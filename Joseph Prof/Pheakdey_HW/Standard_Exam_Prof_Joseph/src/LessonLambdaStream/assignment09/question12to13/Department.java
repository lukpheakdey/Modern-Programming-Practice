package assignment09.question12to13;

import java.util.*;

public class Department {

	public ArrayList<Position> positions;
	public Department(String name, String location) {
		this.name= name;
		this.location= location;
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

	public void print()
	{
		System.out.println("	Department: " + getName() + " Location: " + getLocation());
		positions.forEach(item-> 
		{
			item.print();
		});
	}
	
	double totalSalary;
	public double getSalary()
	{
		totalSalary=0;
		positions.forEach(item-> 
		{
			totalSalary = totalSalary + item.getSalary();
		});
		return totalSalary;
	}
	
	//lab3
	public void printReportingHierarchy()
	{
		System.out.println("	Department: " + getName() + " Location: " + getLocation());
		positions.forEach(item-> 
		{
			if (getDepartmentHead().equals(item))
			{
			   item.print();
			   item.printdownline();
			}
		});
		
	}
	
	Position deptHead = null;
	public Position getDepartmentHead()
	{

		positions.forEach(item-> 
		{
			if (item.isDepartmentHead == true)
			{
				deptHead =  item;
			}
		});
		
		return deptHead;
	
	}
	//lab3

	@Override
	public int hashCode() {
		int result = 17;
		result += 31 * result + ((location == null) ? 0 : location.hashCode());
		result += 31 * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object department) {
		
		//check null
		if (department== null)
			return false;
		// check class name
		if(this.getClass() != department.getClass()) 
			return false;
		// downcast 
		Department dept = (Department)department;
		if (location == null) {
			if (dept.location != null)
				return false;
		} else if (!location.equals(dept.location))
			return false;
		if (name == null) {
			if (dept.name != null)
				return false;
		} else if (!name.equals(dept.name))
			return false;
		if (positions == null) {
			if (dept.positions != null)
				return false;
		} else if (!positions.equals(dept.positions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [" + " Name:" + name + ", Location:" + location + "]";
	}
	
	


}
