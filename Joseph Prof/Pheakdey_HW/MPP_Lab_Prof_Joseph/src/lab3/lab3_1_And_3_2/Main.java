package lab3.lab3_1_And_3_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company("UDAYA Technology");
		
		Department depIT = new Department("IT", "Iowa");
		Department depSale = new Department("Sale", "Fairfield");
		
		Position pos1 = new Position("Programmer", "Junior");
		Position pos2 = new Position("Programmer", "Senior");
		Position pos3 = new Position("AE", "Junior Sale");
		Position pos4 = new Position("AE", "Senior Sale");
		
		Employee emp1 = new Employee("E0001", "Mr. A", " Jonh", "Sina", "10-27-1992", "ssn0001", 1200000.00);
		Employee emp2 = new Employee("E0002", "Mr. B", " Json", "Data", "11-27-1993", "ssn0002", 1500000.00);
		Employee emp3 = new Employee("E0003", "Mr. C", " David", "Well", "11-27-1995", "ssn0003", 2200000.00);
		Employee emp4 = new Employee("E0004", "Mr. D", " Wall", "Date", "12-21-1995", "ssn0004", 1300000.00);
		
		pos1.setEmployee(emp1);
		pos2.setEmployee(emp2);
		pos3.setEmployee(emp3);
		pos4.setEmployee(emp4);
		
		depIT.addPosition(pos1);
		depIT.addPosition(pos2);
		depSale.addPosition(pos3);
		depSale.addPosition(pos4);
		
		company.addDepartment(depIT);
		company.addDepartment(depSale);
		
		company.print();
		
		System.out.println("Total Salary : " + company.getSalary());
		
	}

}
