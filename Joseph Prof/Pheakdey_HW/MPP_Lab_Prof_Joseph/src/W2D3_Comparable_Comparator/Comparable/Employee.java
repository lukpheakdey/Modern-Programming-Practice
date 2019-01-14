package W2D3_Comparable_Comparator.Comparable;

public class Employee implements Comparable{
	
	private String name;
	private int age;
	
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Object arg0) {
		if(age == ((Employee)arg0).getAge())
			return 0;
		else if(age < ((Employee)arg0).getAge())
			return 1;
		else
			return -1;
	}
}
