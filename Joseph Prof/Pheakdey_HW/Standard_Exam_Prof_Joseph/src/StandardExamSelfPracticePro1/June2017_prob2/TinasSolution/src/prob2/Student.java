package prob2;

abstract public class Student {

	public String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract double computeGpa();

}
