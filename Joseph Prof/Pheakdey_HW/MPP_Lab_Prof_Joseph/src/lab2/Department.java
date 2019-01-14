package lab2;

import java.util.List;
import java.util.*;


public class Department {
	
	private String name;
	
	public List<Person> person;
	
	Department(String name){
		this.name = name;
		person = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) {
		person.add(p);
	}
	
	public double getTotalSalary() {
		double totalSalary = 0.0;
		for(Person p : person) {
			if( p instanceof Staff) {
				totalSalary += ((Staff) p).getSalary();
				
			} else if (p instanceof Faculty) {
				totalSalary += ((Faculty) p).getSalary();
			}
			
		}
		return totalSalary;
	}
	
	public void showAllMembers() {
		for(Person p : person) {
			System.out.println("Type : " + p.getClass().getSimpleName());
			System.out.println("Name : " + p.getName() + " Age : "+ p.getAge() + " Phone : "+ p.getPhone() +"\n");
		}
	}

	public void unitsPerFaculty() {
		Faculty faculty = null;
		for(Person p : person) {	
			if(p instanceof Faculty) {
				faculty = (Faculty)p;
				System.out.println("Type : " + p.getClass().getSimpleName());
				System.out.println("Name : " + p.getName() + " Unit Per Faculty "+ faculty.getTotalUnits());
			}
		}
	}

}
