package assignment10.school;

import java.io.*;                 // for I/O
import java.lang.Integer;  
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments,
 * variable names, etc to follow the class coding conventions.
 */

public class Application
{
	   public static void main(String[] args) throws IOException, ParseException
	      {
	      Department dept = new Department("ComputerScience");
	      
	      //  The following commented out code will help you 
	      //  create the objects that you need.
	      
	    
			// Create faculty objects
			Faculty frankMoore = new Faculty("Frank Moore","472-5921",43,10000);	
			Faculty samHoward = new Faculty("Sam Howard","472-7222",55,9500);
			Faculty johnDoodle = new Faculty("John Doodle","472-6190",39,8600);
			dept.AddPerson(frankMoore);
			dept.AddPerson(samHoward);
			dept.AddPerson(johnDoodle);


			// Create student objects
			Student johnDoe = new Student("John Doe","472-1121",22,4.0);
			Student maryJones = new Student("Mary Jones","472-7322",32,3.80);
			Student leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);
			dept.AddPerson(johnDoe);
			dept.AddPerson(maryJones);
			dept.AddPerson(leeJohnson);
			

			// Create staff objects
			Staff frankGore = new Staff("Frank Gore","472-3321",33,4050);
			Staff adamDavis = new Staff("Adam Davis","472-7552",50,5500);
			Staff davidHeck = new Staff("David Heck","472-8890",29,3600);
			dept.AddPerson(frankGore);
			dept.AddPerson(adamDavis);
			dept.AddPerson(davidHeck);
			
			
			//test Student Staff
			String str_date="11-June-07";
			DateFormat formatter = new SimpleDateFormat("dd-MMM-yy"); 
			Date date = formatter.parse(str_date);
			
			StaffStudents victorpineda =new StaffStudents("Victor Pineda","472-8890",31,1,3600,date);
			victorpineda.AddCourse(new Course("cs201","programming",4, johnDoodle));
			dept.AddPerson(victorpineda);


			// Create course objects	
			Course cs201 = new Course("cs201","programming",4, johnDoodle);
			Course cs360 = new Course("cs360","database",3, samHoward);
			Course cs404 = new Course("cs404","compiler",4, johnDoodle);
			Course cs240 = new Course("cs240","datastructure",2, johnDoodle);
			Course cs301 = new Course("cs301","Software engg",3, samHoward);
			Course cs450 = new Course("cs450","Advanced architecture",5,frankMoore);

			//add Courses for faculty
			dept.AddCourse(cs201);
			dept.AddCourse(cs360);
			dept.AddCourse(cs404);
			dept.AddCourse(cs240);
			dept.AddCourse(cs301);
			dept.AddCourse(cs450);
			
			
			// Create course objects for Student	
			cs201 = new Course("cs201","programming",4, johnDoe); 
			dept.AddCourse(cs201);	
			cs201 = new Course("cs201","programming",4, maryJones); 
			dept.AddCourse(cs201);	
			cs201 = new Course("cs201","programming",4, leeJohnson); 
				
			cs360 = new Course("cs360","database",3, johnDoe);
			dept.AddCourse(cs360);	
			cs360 = new Course("cs360","database",3, leeJohnson);
			dept.AddCourse(cs360);	
				
				
			cs404 = new Course("cs404","compiler",4, johnDoe);
			dept.AddCourse(cs404);	
			cs404 = new Course("cs404","compiler",4, maryJones);
			dept.AddCourse(cs404);	
				
			cs240 = new Course("cs240","datastructure",2, leeJohnson);
			dept.AddCourse(cs240);	
				
			cs301 = new Course("cs301","Software engg",3, johnDoe);
			dept.AddCourse(cs301);
				
			cs450 = new Course("cs450","Advanced architecture",5,leeJohnson);
			dept.AddCourse(cs450);
			
			
			
			

			/*
			 * The above course objects will go inside either
			 * a faculty object, or a student object.  Not all of the course
			 *  objects go into the same object.
			 * 
			 *  You would have code that looks something like :
			 *  frankMoore.addCourse(cs450);
			 * 
			 *  The addCourse method would have to be written in
			 *  the faculty class.  Something similar would be done 
			 *  for students.
			 */
	      
	    
	      
	      
	      double totsalary = 0;

	      while(true)
	         {
	         putText("Enter first letter of ");
	         putText("getTotalSalary, showAllMembers, unitsPerFaculty, xunitsPerStudent or quit : ");
	         int choice = getChar();
	         switch(choice)
	            {
	            case 'g':
	               totsalary=dept.getTotalSalary();
	               putText("Total sum of all salaries is:");
	               System.out.printf("$%,.2f \n" ,totsalary );      
	               break;
	            case 's':
	               dept.showAllMembers();
	               break;
	            case 'u':
	               dept.unitsPerFaculty();
	               break;
	            case 'x':
		               dept.unitsPerStudent();
		               break;
	            case 'q': return;
	            default:
	               putText("Invalid entry\n");
	            }  // end switch
	         }  // end while
	      }  // end main()
	// -------------------------------------------------------------
	   public static void putText(String s) //writes string s to the screen
	      {
	      System.out.println(s);
	      }
	// -------------------------------------------------------------
	   public static String getString() throws IOException  //reads a string from the keyboard input
	      {
	      InputStreamReader isr = new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(isr);
	      String s = br.readLine();
	      return s;
	      }
	// -------------------------------------------------------------
	   public static char getChar() throws IOException //reads a character from the keyboard input
	      {
	      String s = getString();
	      return s.charAt(0);
	      }

	//-------------------------------------------------------------
	   public static int getInt() throws IOException // reads an integers from the keyboard input
	      {
	      String s = getString();
	      return Integer.parseInt(s);
	      }
	// -------------------------------------------------------------
	   }  