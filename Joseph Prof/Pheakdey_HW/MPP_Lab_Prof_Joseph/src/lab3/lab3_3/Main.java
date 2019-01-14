package lab3.lab3_3;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Company comp = new Company ("Google");
		Department ITdept = new Department("IT Department", "Tower 1 Level 1");
		
		Position PM = new Position("Project Manager", "Managing the Department / Projects");
		Position JSE =  new Position("Junior Software Engineer", "Developer");
		Position SSE =  new Position("Senior Software Engineer", "Developer");
		
		//lab 3_3
		PM.downlinePosition.add(SSE);
		PM.isDepartmentHead= true;
		SSE.downlinePosition.add(JSE);
		
		//lab 3_3
	    ITdept.positions.add(JSE);
	    ITdept.positions.add(SSE);
	    ITdept.positions.add(PM);
		    
	    Employee empPheakdey = new Employee("EMP0001", "Victor", "D", "Pineda", "11-May-84", "123456", 5000,SSE);
	    Employee empJson = new Employee("EMP0002", "Jennyfer", "D", "Hubac", "11-May-84", "123456", 5000,PM);
	    Employee empDavid = new Employee("EMP0003", "Tinbit", "D", "Cher", "11-May-84","123456", 5000,JSE);
	    
	    PM.employees.add(empJson);
	  
	    SSE.employees.add(empPheakdey);
	    
	    JSE.employees.add(empDavid);
	    
	    comp.departments.add(ITdept);
		    
		Department Accountingdept = new Department("Accounting Department", "Tower 1 Level 2");
	
		Position Manager = new Position("Manager", "Managing");
	    Manager.isDepartmentHead = true;
		Position Auditor = new Position("Auditor", "Auditing");
		Position Accountant = new Position("Accountant", "Ledger");
		Position Assistant =  new Position("Assistant", "Accounting assistant");
	
		//lab 3_3
		Manager.downlinePosition.add(Auditor);
		Auditor.downlinePosition.add(Accountant);
		Accountant.downlinePosition.add(Assistant);
			 
		//lab 3_3
  
		Accountingdept.positions.add(Manager);
		Accountingdept.positions.add(Auditor);
		Accountingdept.positions.add(Accountant);
		Accountingdept.positions.add(Assistant);
			    
		Employee run = new Employee("EMP0004", "David", "D", "Beckham", "11-May-84", "123456", 55000, Manager);
		Employee bon = new Employee("EMP0005", "David", "B", "Son", "11-May-84", "123456", 5000, Auditor);
		Employee ban = new Employee("EMP0006", "Sam", "E", "Wall", "11-May-84", "123456", 5000, Accountant);
		Employee bin = new Employee("EMP0007", "John", "T", "Sina", "11-May-84", "123456", 5000, Assistant);
		
		Manager.employees.add(run);
		Auditor.employees.add(bon);
		Accountant.employees.add(ban);
		Assistant.employees.add(bin);
         
		comp.departments.add(Accountingdept);
			   
		//lab 3_3	   
		Department CEOdept = new Department(null, "Tower 1 Level 1"); 	
		
		Position CEO = new Position("CEO","Cheap Executive Officer");
		CEOdept.positions.add(CEO);
		Employee joseph = new Employee("EMP0008", "Joseph", "D", "Lerman", "11-May-84", "123456", 55000,CEO); 
		CEO.employees.add(joseph);
		
		comp.departments.add(CEOdept);	
		
		//lab 3_3
		comp.print();
		comp.getSalary();
		 
		System.out.println("\n***********************************************************************");
		
		comp.printReportingHierarchy();
		
	}
}
