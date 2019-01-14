package lab3.lab3_3;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
	private String employeeID;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String birthDate;
	private String SSN;
	private double salary;

	private Position empPossition;
	
	public Position getEmpPossition() {
		return empPossition;
	}
	
	public Employee(String employeeID, String firstName,String middleInitial,String lastName, String birthDate, String SSN, double salary, Position empPossition ) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.SSN = SSN;
		this.salary = salary;
		this.empPossition = empPossition;
	}
		
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary(){
       return this.salary;
	}
	
	public void print(){
		System.out.println("\t" + "Employee ID: " + employeeID );
		System.out.println("\t" + "First Name: " + firstName );
		System.out.println("\t" + "Middle Initial: " + middleInitial );
		System.out.println("\t" + "Birth Date: " + birthDate );
		System.out.println("\t" + "SSN: " + SSN );
		System.out.printf("\tSalary: $ %,.2f \n",salary );
		//System.out.println(Tab + "Position: " + empPossition.getTitle() );
	}
}
