package LambdaStreamLab.schoolLab;

public class Staff extends Person {
	
	protected double salary;
	
	public double getSalary() {
		return salary;
	}
	
	Staff(String name, String phone, int age, double salary){
		super(name, phone, age);
		this.salary = salary;
	}
	
	
	
}
