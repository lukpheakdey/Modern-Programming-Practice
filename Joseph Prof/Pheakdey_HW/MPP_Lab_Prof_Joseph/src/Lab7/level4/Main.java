package Lab7.level4;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Department dept = new Department("ComputerScience");
	      
		Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);	
		Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
		Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);

		dept.addPerson (frankMoore);
		dept.addPerson (samHoward);
		dept.addPerson (johnDoodle);
		
		//dept.addFaculty(samHoward);
		//dept.addFaculty(johnDoodle);


		// Create student objects
		Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
		Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
		Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);

		dept.addPerson(johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);
		//dept.addStudent(maryJones);
		//dept.addStudent(leeJohnson);
			

		// Create staff objects
		Person frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
		Person adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
		Person davidHeck = new Staff("David Heck", "472-8890", 29, 3600);
		
		//level 4
		Person pheakdey = new StaffStudent("Pheakdey", "123-4567", 27, 250);
		dept.addPerson(pheakdey);
		
		dept.addPerson (frankGore);
		dept.addPerson (adamDavis);
		dept.addPerson (davidHeck);
		
		//dept.addStaff(adamDavis);
		//dept.addStaff(davidHeck);

		Course cs201 = new Course("cs201", "programming", 4, johnDoodle);
		Course cs360 = new Course("cs360", "database",3, samHoward);
		Course cs404 = new Course("cs404", "compiler",4, johnDoodle);
		Course cs240 = new Course("cs240", "datastructure",2, johnDoodle);
		Course cs301 = new Course("cs301", "Software engg",3, samHoward);
		Course cs450 = new Course("cs450", "Advanced architecture",5, frankMoore);
		
		((Faculty) johnDoodle).addCourse(cs201);
		((Faculty) samHoward).addCourse(cs360);
		((Faculty) johnDoodle).addCourse(cs404);
		((Faculty) johnDoodle).addCourse(cs240);
		((Faculty) samHoward).addCourse(cs301);
		((Faculty) frankMoore).addCourse(cs450);
		
		// Interface Default
		System.out.println(frankGore.myDefault());
		frankGore.myAbstract();
		IPerson.myStatic();

	    double totsalary = 0;
	    
	    while(true) {
	    	
	    	putText("\nEnter first letter of ");
	    	putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
	    	int choice = getChar();
	    	switch(choice) {
		    	case 'g':
				   totsalary=dept.getTotalSalary();
				   putText("Total sum of all salaries is:");
				   putText(String.valueOf(totsalary)+"\n");              
				   break;
		    	case 's':
		    		dept.showAllMembers();
		    		break;
		    	case 'u':
		    		dept.unitsPerFaculty();
		    		break;
		    	case 'q': return;
		    	default:
		    		putText("Invalid entry\n");
	    		}  // end switch
		 }  // end while
	    
	   
	}
	
	
	public static void putText(String s) {
    	System.out.println(s);
    }

	public static String getString() throws IOException {
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    String s = br.readLine();
	    return s;
    }

	public static char getChar() throws IOException {
	    String s = getString();
	    return s.charAt(0);
    }

	public static int getInt() throws IOException {
	    String s = getString();
	    return Integer.parseInt(s);
    }

}
