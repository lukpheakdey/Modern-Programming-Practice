package assignment09.question09to11;

import java.io.*;                 // for I/O
import java.lang.Integer;  
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import assignment01.Student;


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
      
	   System.out.println("***************************Interface Test*********************************");
	   Person person = new Person();
	   person.myDefault();
	   IPerson.myStatic();
	   person.myAbstract();
	   
	   System.out.println("***************************Enum Test*********************************");
	   Student johnDoe = new Student("John Doe","472-1121",25,4.0);
	   johnDoe.setStudentlevel(StudentLevel.freshman);
	   Student Tinbit = new Student("Tinbit","472-3626",26,4.0);
	   Tinbit.setStudentlevel(StudentLevel.sophomore);
	   Student Victor = new Student("Victor","472-3626",27,4.0);
	   Victor.setStudentlevel(StudentLevel.junior);
	   Student Eyob = new Student("Eyob","472-8934",29,4.0);
	   Eyob.setStudentlevel(StudentLevel.senior);
	   System.out.println(johnDoe);
	   System.out.println(Tinbit);
	   System.out.println(Victor);
	   System.out.println(Eyob);
		
	   System.out.println("***************************Immutable Class Test*********************************");
	   Immutable im = new Immutable();
	   System.out.println(im);

      }
// -------------------------------------------------------------
   }  // end class 


final class Immutable {

	final String name="Victor Angelo Pineda";
	public Immutable() {
		// TODO Auto-generated constructor stub
		this.age=31;
		this.height="5'11";
		this.weight ="65 kg";
	}
	
	

	@Override
	public String toString() {
		return "Immutable [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}



	private int age;
	private String height;
	private String weight;

	public int getAge() {
		return age;
	}
	public String getHeight() {
		return height;
	}
	public String getWeight() {
		return weight;
	}
	
	
}