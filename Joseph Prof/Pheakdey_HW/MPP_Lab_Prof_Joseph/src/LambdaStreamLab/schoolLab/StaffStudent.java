package LambdaStreamLab.schoolLab;

public class StaffStudent extends Staff{
	
	public Student student;

	StaffStudent(String name, String phone, int age, double salary) {
		super(name, phone, age, salary);
	}
	
	public double getSalary() {
		return salary;
	}

}
