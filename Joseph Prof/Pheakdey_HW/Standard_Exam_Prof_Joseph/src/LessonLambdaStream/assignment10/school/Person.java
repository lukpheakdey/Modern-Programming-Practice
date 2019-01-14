package assignment10.school;

public class Person implements IPerson {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String phone;
	private  int age;

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void myAbstract() {
		// TODO Auto-generated method stub
		System.out.println("From Abstract method.. ");
	}
}
