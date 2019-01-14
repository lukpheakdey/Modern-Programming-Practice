package assignment09.question09to11;

import java.util.*;

public class StaffStudents extends Student implements IStaff {

	   private Staff staff;
	public StaffStudents(String name, String phone, int age, double gpa, double salary, Date date) {
		super(name, phone, age, gpa);
		setType("staffstudent");

		staff = new Staff(name,  phone,  age,  salary);
	}

   private String type;
	

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public double getSalary() {
		return staff.getSalary();
	}



	
	//Staff Student only
	private Date date;

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }
	
    public ArrayList<Course> courses = new ArrayList<Course>();
    public void AddCourse(Course c)
	{
		courses.add(c);
	}
    //Staff Student only
	

}
