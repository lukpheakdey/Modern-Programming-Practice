package assignment10.school;

import java.util.*;

public class Department {

	
	private String name;
	
	public ArrayList<Person> persons = new ArrayList<Person>();
	
	public Department(String name) {
		this.name = name;
	}
	
	public String Name()
	{
		return this.name;
	}
	
	
	 // computes the sum of all the salaries (per month) paid to faculty and staff.
	
	public double getTotalSalary()
	{
		
		double facultySalary = persons
		.stream()
		.filter(person -> (person instanceof Faculty))
		.mapToDouble(person -> 
		{
			Faculty faculty= (Faculty) person;
			return faculty.getSalary();
		})
		.reduce(0, (x,y)-> x+y);
		
		
		double staffSalary = 
		persons
		.stream()
		.filter(person -> (person instanceof  Staff ))
		.mapToDouble(person -> 
		{
			Staff staff= (Staff) person;
			return staff.getSalary();
		})
		.reduce(0, (x,y)-> x+y);
		
		return facultySalary + staffSalary ;
	}
	
	public void showAllMembers()
	{
		// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
		
		persons.forEach(person ->
		{
			if (person instanceof Faculty)
			{
				Faculty faculty= (Faculty) person;
				System.out.println("Name:" + faculty.getName() + " Phone Number:" + faculty.getPhone() + " Age:" + faculty.getAge() + " Type:" + faculty.getType());
			}

			else if (person instanceof Student)
			{
				Student student= (Student) person;
				System.out.println("Name:" + student.getName() + " Phone Number:" + student.getPhone() + " Age:" + student.getAge() + " Type:" + student.getType());
			}
			else 
			{
				Staff staff= (Staff) person;
				System.out.println("Name:" + staff.getName() + " Phone Number:" + staff.getPhone() + " Age:" + staff.getAge() + " Type:" + staff.getType());
			}
			
			
			
		}
		);
	}
	
	//***** shows a list of all faculty names and the total number of units they teach.
	
    public ArrayList<Course> courses = new ArrayList<Course>();
	
	public void AddCourse(Course c)
	{	
		persons.forEach(person ->
		{
			if (person instanceof Faculty)
			{
				Faculty faculty= (Faculty) person;
				
				if(faculty.equals(c.person))
				{
					
					faculty.AddCourse(c);
					faculty.setTotalUnits(faculty.getTotalUnits() + c.getUnits());
				}
				
			}
			
			if (person instanceof Student)
			{
				Student student= (Student) person;
				
				if(student.equals(c.person))
				{
					
					student.AddCourse(c);
					student.setTotalUnits(student.getTotalUnits() + c.getUnits());
				}
				
			}
		});
		
		
	}

	public void unitsPerFaculty()
	{
		
		
		
		persons
		.stream()
		.filter(person->person instanceof Faculty)
		.forEach(person ->
		{
			    double unitsPerFaculty = 0;
		
				Faculty faculty= (Faculty) person;
				unitsPerFaculty = faculty.getTotalUnits();
	
				
				
				System.out.print("Name:" + faculty.getName()); 
				faculty.courses.forEach(item -> {System.out.print( "["+ item.getNumber() +"]");})	;
				System.out.print(" Total Number of Units:" + unitsPerFaculty + "\n" );
			

		});
		
		
		
	}
	
	
	
	public void unitsPerStudent()
	{
		persons.forEach(person ->
		{
			
			if (person instanceof Student)
			{
				Student student= (Student) person;
				
				System.out.print("Name:" + student.getName()); 
				student.courses.forEach(item -> {System.out.print( "["+ item.getNumber() +"]");})	;
				System.out.print(" Total Number of Units:" + student.getTotalUnits() + "\n" );
			
	
			}
		});
	}
	
	/**/
	public void AddPerson(Person p)
	{
		persons.add(p);
	}
	
	
	
	

}
