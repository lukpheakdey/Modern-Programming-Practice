package Lab7;

import java.util.*;
import java.util.ArrayList;

public class Position implements Cloneable {
	
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Position p = (Position)obj;
		if(this.title == null && p.title != null)
			return false;
		if(this.description == null && p.description !=null)
			return false;
		
		if( (!this.title.equals(p.title)) || (!this.description.equals(p.description)))
			return false;
		return true;
			
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}
	
//	@Override
//	public int hashCode() {
//		int prime = 31;
//		int result = 1;
//		result = prime * result + title.hashCode();
//		result = prime * result + description.hashCode();
//		return result;
//	}
	
	@Override
	public String toString() {
		return "Position Information : \n" + "Title : " + title + " Description : " + description;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Position copy = (Position)super.clone();
		return copy;
	}

}
