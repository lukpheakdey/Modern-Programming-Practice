package Lab7;

import java.util.*;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
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
		
		//Lab7
		System.out.println("******* Lab 7 *********\n");
		Employee emp1Lab7 = new Employee("E0001", "Mr. A", " Jonh", "Sina", "10-27-1992", "ssn0001", 1200000.00);
		Employee emp2Lab7 = new Employee("E0001", "Mr. A", " Jonh", "Sina", "10-27-1992", "ssn0001", 1200000.00);
		Employee emp3Lab7 = new Employee("E0003", "Mr. C", " Json", "Data", "11-27-1993", "ssn0002", 1500000.00);
		
		System.out.println("Emeployee 1 and Employee2 is Equal? = " + emp1Lab7.equals(emp2Lab7));
		System.out.println("Emeployee 1 and Employee3 is Equal? = " + emp1Lab7.equals(emp3Lab7));
		
		
		Position pos1Lab7 = new Position("Programmer", "Junior");
		Position pos2Lab7 = new Position("Programmer", "Junior");
		Position pos3Lab7 = new Position("AE", "Junior Sale");
		System.out.println("\nPosition 1 and Position 2 is Equal? = " + pos1Lab7.equals(pos2Lab7));
		System.out.println("Position 1 and Position 3 is Equal? = " + pos1Lab7.equals(pos3Lab7));
		
		
		Department depITLab7 = new Department("IT", "Iowa");
		Department depIT2Lab7 = new Department("IT", "Iowa");
		Department depSaleLab7 = new Department("Sale", "Fairfield");
		
		System.out.println("\nDepartment 1 and Department 2 is Equal? = " + depITLab7.equals(depIT2Lab7));
		System.out.println("Department 1 and Department 3 is Equal? = " + depITLab7.equals(depSaleLab7));
		
		System.out.println("\n\n******* Employe ToString ********");
		System.out.println(emp1Lab7);
		
		System.out.println("\n\n******* Position ToString ********");
		System.out.println(pos1Lab7);
		
		System.out.println("\n\n******* Department ToString ********");
		System.out.println(depITLab7);
		
		
		System.out.println("\n\n Testing Override Clone For Position : ");
		Position pos1Clone = new Position("Programmer", "Junior");
		Position pos2Clone = (Position) pos1Clone.clone();
		
		System.out.println(pos1Clone);
		System.out.println(pos2Clone);
		
		
		System.out.println("\n\n Testing Override Clone For Employee : ");
		Employee emp1Clone = new Employee("E0001", "Mr. A", " Jonh", "Sina", "10-27-1992", "ssn0001", 1200000.00);
		Employee emp2Clone = (Employee) emp1Clone.clone();
		
		System.out.println(emp1Clone);
		System.out.println(emp2Clone);
		
		
	}

}
