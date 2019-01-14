package LambdaStreamLab.schoolLab;

public class Person {
	
	private String name;
	private String phone;
	private int age;
	
	Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
