package Lab7.level4;

import java.util.ArrayList;
import java.util.List;

public interface IPerson {
	
	String getName();
	String getPhone();
	int getAge();
	
	//List<Person> person = new ArrayList<Person>();
	
	default String myDefault() {
		return "Interface Default-> Name : " + getName() + " Phone : " + getPhone() + " Age : " + getAge();
	}
	
	public static void myStatic() {
		System.out.println("Static Interface");
	}
	
	abstract void myAbstract();

}
