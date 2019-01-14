package assignment09.question12to13;

import java.util.*;

public class Employee implements Cloneable {

	private Position empPossition;
	public Position getEmpPossition() {
		return empPossition;
	}
	public Employee(int employeeID,String firstName,String middleInitial,String lastName,Date birthDate,String SSN, double salary,Position empPossition ) {
		// TODO Auto-generated constructor stub
		        this.employeeID = employeeID;
		        this.firstName= firstName;
		        this.middleInitial=middleInitial;
		        this.lastName=lastName;
		        this.birthDate=birthDate;
		        this.SSN=SSN;
		        this.salary=salary;
		        this.empPossition = empPossition;
	}
	
	private int employeeID;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date birthDate;
	private String SSN;
	private double salary;
		
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary()
	{
       return this.salary;
	}
	public String Tab = "\t";
	public void print()
	{
		System.out.println(Tab + "Employee ID: " + employeeID );
		System.out.println(Tab + "First Name: " + firstName );
		System.out.println(Tab + "Middle Initial: " + middleInitial );
		System.out.println(Tab + "Birth Date: " + birthDate );
		System.out.println(Tab + "SSN: " + SSN );
		System.out.printf(Tab + "Salary: $ %,.2f \n",salary );
		//System.out.println(Tab + "Position: " + empPossition.getTitle() );
		
		
	}
	
	
	public int hashCode() {
		int result = 17;
		result += 31 * result + ((SSN == null) ? 0 : SSN.hashCode());
		result += 31 * result + ((Tab == null) ? 0 : Tab.hashCode());
		result += 31 * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result += 31 * result + employeeID;
		result += 31 * result + ((empPossition == null) ? 0 : empPossition.hashCode());
		result += 31 * result + ((firstName == null) ? 0 : firstName.hashCode());
		result += 31 * result + ((lastName == null) ? 0 : lastName.hashCode());
		result += 31 * result + ((middleInitial == null) ? 0 : middleInitial.hashCode());
		
		//numeric
		long temp;
		temp = Double.doubleToLongBits(salary);
		result += 31 * result + (int) (temp ^ (temp >>> 32));
		
		
		
		
		return result;
	}
	
	
	
	public boolean equals(Object employee)
	{
		//check null
		if (employee== null)
			 return false;
		// check class name
		if(this.getClass() != employee.getClass()) 
			return false;
		// downcast 
		Employee emp = (Employee)employee;
		
		if (SSN == null)
		{
			if(emp.SSN != null)
			{
				return false;
			}
		}else if(!SSN.equals(emp.SSN))
		{
		   return false;
		}
		
	
	
		if (birthDate == null) {
			if (emp.birthDate != null)
				return false;
		} else if (!birthDate.equals(emp.birthDate))
			return false;
		
		
		if (empPossition == null) {
			if (emp.empPossition != null)
				return false;
		} else if (!empPossition.equals(emp.empPossition))
			return false;
		
		
		if (employeeID != emp.employeeID)
			return false;
		
		if (firstName == null) {
			if (emp.firstName != null)
				return false;
		} else if (!firstName.equals(emp.firstName))
			return false;
		
		if (lastName == null) {
			if (emp.lastName != null)
				return false;
		} else if (!lastName.equals(emp.lastName))
			return false;
		
		
		if (middleInitial == null) {
			if (emp.middleInitial != null)
				return false;
		} else if (!middleInitial.equals(emp.middleInitial))
			return false;
		
		
		if (salary!= emp.salary)
			return false;
		
	
		
		//always return true
		return true;
		
	}
	

	public String toString() {
		return "Employee [ Employee ID:" + employeeID + ", First Name:" + firstName
				+ ", Middle Initial:" + middleInitial + ", Last Name:" + lastName + ", Birth Date:" + birthDate + ", SSN:"
				+ SSN + ", salary:" + salary  + " Position:" + empPossition + "]" ;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		
		Employee emp = (Employee)super.clone();
		emp.empPossition = this.empPossition;
		return emp;
	}
	

}
