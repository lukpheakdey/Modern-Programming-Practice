package LambdaStreamLab.lab3_1_And_3_2LambdaStream;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
	private String employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String birthDate;
	private String ssn;
	private double salary;
	
	//private Position poition;
	
	Employee(String employeeId, String firstName, String middleName, String lastName, String birthDate, String ssn, double salary){
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void print() {
		System.out.print("\t\t Employee ID : " + getEmployeeId() + 
						"\n\t\t First Name : " + getFirstName() +
						"\n\t\t Middel Name : " + getMiddleName() +
						"\n\t\t LtLast Name : " + getLastName() +
						"\n\t\t Birth Date : " + getBirthDate() +
						"\n\t\t SSN : " + getSsn() + 
						"\n\t\t Salary : " + getSalary());
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}
