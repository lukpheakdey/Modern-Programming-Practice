package StandardExamSelfPracticePro1.June2017_prob2.Exam.prob2_Sol;

abstract public class Student {
	
	private String name;
	
	abstract public double computeGpa();
	
	public String getName() {
		return name;
	}
	
	Student(String name){
		this.name = name;
	}
}
