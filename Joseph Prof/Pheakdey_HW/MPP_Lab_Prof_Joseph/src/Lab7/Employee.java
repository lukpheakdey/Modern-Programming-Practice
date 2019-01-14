package Lab7;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements Cloneable {
	
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
	
	//lab7
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee emp1 = (Employee)obj;
		
		if(this.employeeId == null && emp1.employeeId == null)
			return false;
		if(this.firstName == null && emp1.firstName == null)
			return false;
		if(this.lastName == null && emp1.lastName == null)
			return false;
		if(this.middleName == null && emp1.middleName == null)
			return false;
		if(this.birthDate == null && emp1.birthDate == null)
			return false;
		if(this.ssn == null && emp1.ssn == null)
			return false;
		
		if(
				(!this.employeeId.equals(emp1.employeeId)) ||
				(!this.firstName.equals(emp1.firstName)) ||
				(!this.middleName.equals(emp1.middleName)) ||
				(!this.lastName.equals(emp1.lastName)) ||
				(!this.birthDate.equals(emp1.birthDate)) ||
				(!this.ssn.equals(emp1.ssn))
		)
			return false;
		return true;
		
//		boolean isEqual = this.firstName.equals(emp1.firstName);
//		return isEqual;	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

//	@Override
//	public int hashCode() {
//		int prime = 31;
//		int result = 1;
//		result = prime * result + firstName.hashCode();
//		result = prime * result + lastName.hashCode();
//		return result;
//	}
	
	@Override
	public String toString() {
		return "Employee Information : \nName (First,Middle,Last) : " + firstName + " " + middleName + " " + lastName +
				"Birthdate : " + birthDate + " SSN : " + ssn + " Salary : " + salary;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee copy = (Employee)super.clone();
		return copy;
	}
	
}
