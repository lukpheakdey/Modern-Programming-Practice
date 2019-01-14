package assignment09.question12to13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		// TODO Auto-generated method stub

		Company comp = new Company ("Microsoft");
		
		Department ITdept = new Department("IT Department", "Tower 1 Level 1");

		  
		  Position PM = new Position("Project Manager","Managing the Department/ Projects");
		  Position JSE =  new Position("JR Software Engineer","Develop program");
		  Position SSE =  new Position("Senior Software Engineer","Develop program");
		
		  //lab 3
	
		
		  PM.downlinePosition.add(SSE);
		  PM.isDepartmentHead= true;
		  SSE.downlinePosition.add(JSE);
		
		  //lab 3
		  
		    ITdept.positions.add(JSE);
		    ITdept.positions.add(SSE);
		    ITdept.positions.add(PM);
		    
		  
		    
		    
		    System.out.println("\n\n***********************Position clone******************************");
		    System.out.println("PM2 clone PM" );
		    Position PM2 = (Position) PM.clone();
		    System.out.println(PM2.toString());
		    
			DateFormat formatter = new SimpleDateFormat("dd-MMM-yy"); 

		    Employee victor = new Employee( 1,"Victor","D","Pineda",formatter.parse("11-May-84"),"123456", 5000,SSE);
		    Employee jennyfer = new Employee( 2,"Jennyfer","D","Hubac",formatter.parse("11-May-84"),"123456", 5000,PM);
		    Employee tinbit = new Employee( 3,"Tinbit","D","Cher",formatter.parse("11-May-84"),"123456", 5000,JSE);
		    
		    
		    PM.employees.add(jennyfer);
		  
		    SSE.employees.add(victor);
		    JSE.employees.add(tinbit);
		    
		    
		    System.out.println("\n\n***********************Employee Clone******************************");
		    System.out.println("newVictor clone victor");
		    Employee newVictor = (Employee) victor.clone();
		    System.out.println(newVictor.toString());
		    
		    
		    
		    comp.departments.add(ITdept);
		    
		Department Accountingdept = new Department("Accounting Department", "Tower 1 Level 2");
	
		      Position Manager = new Position("Manager","managing");
		      Manager.isDepartmentHead = true;
			  Position Auditor = new Position("Auditor","Auditing");
			  Position Accountant = new Position("Accountant","Ledger");
			  Position Assistant =  new Position("Assistant","Accounting assistant");
			
			  //lab 3
			  Manager.downlinePosition.add(Auditor);
			  Auditor.downlinePosition.add(Accountant);
			  Accountant.downlinePosition.add(Assistant);
			 
			  //lab 3
			  
			  Accountingdept.positions.add(Manager);
			  Accountingdept.positions.add(Auditor);
			  Accountingdept.positions.add(Accountant);
			  Accountingdept.positions.add(Assistant);
			    
			    Employee run = new Employee( 4,"Run","D","Pineda",formatter.parse("11-May-84"),"123456", 55000,Manager);
			    Employee bon = new Employee( 4,"Bon","D","Pineda",formatter.parse("11-May-84"),"123456", 5000,Auditor);
			    Employee ban = new Employee( 5,"Ban","D","Hubac",formatter.parse("11-May-84"),"123456", 5000,Accountant);
			    Employee bin = new Employee( 6,"Bin","D","Cher",formatter.parse("11-May-84"),"123456", 5000,Assistant);
			    
			    Manager.employees.add(run);
			    Auditor.employees.add(bon);
			    Accountant.employees.add(ban);
			    Assistant.employees.add(bin);
         
			   comp.departments.add(Accountingdept);
			   
			    	
			 //lab 3
			Department CEOdept = new Department(null, "Tower 1 Level 1"); 	

			Position CEO = new Position("CEO","Cheap Executive Officer");
			CEOdept.positions.add(CEO);
			Employee joseph = new Employee( 1,"Joseph","D","Lerman",formatter.parse("11-May-84"),"123456", 55000,CEO); 
			CEO.employees.add(joseph);

			comp.departments.add(CEOdept);	
			//lab 3
			   
			   
			/* comp.print();
			 comp.getSalary();
			 
			 System.out.println("\n***********************************************************************");
	
			comp.printReportingHierarchy();*/
		
	}

}
