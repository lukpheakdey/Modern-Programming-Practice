package LambdaStreamLab.schoolLab;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.*;


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
	
	// Using Stream
	public double getTotalSalaryUsingStream() {
		
		double facultySalary = person.stream()
								.filter(p -> (p instanceof Faculty))
								.mapToDouble(person -> 
								{
									Faculty faculty= (Faculty) person;
									return faculty.getSalary();
								})
								.reduce(0, (x,y)-> x+y);
		
		double staffSalary = person.stream()
							.filter(p -> (p instanceof Staff ))
							.mapToDouble(person -> 
							{
								Staff staff= (Staff) person;
								return staff.getSalary();
							})
							.reduce(0, (x,y)-> x+y);
		
		 return facultySalary + staffSalary ;
	}
	
	public void showAllMembers() {
		for(Person p : person) {
			System.out.println("Type : " + p.getClass().getSimpleName());
			System.out.println("Name : " + p.getName() + " Age : "+ p.getAge() + " Phone : "+ p.getPhone() +"\n");
		}
	}
	
	// Using Stream
	public void showAllMembersStream() {
		System.out.println("\n\nStream Result : ");
		person.stream()
				.map(p -> p.getName())
				.collect(Collectors.toList())
				.forEach(System.out::println);
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
	
	// Using Stream
	public void unitsPerFacultyUsingStream() {
		person.stream()
			.filter( person -> person instanceof Faculty)
			.forEach( person -> {
				Faculty f = (Faculty)person;
				System.out.println("Type : " + f.getClass().getSimpleName());
				System.out.println("Name : " + f.getName() + "Unit Per Faculty " + f.getTotalUnits());
			});
	}
}
