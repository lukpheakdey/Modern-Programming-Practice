package StandardExamSelfPracticePro1.March2018_1.prob2;
import java.util.*;

public class PlanOfStudy {
	
	List<Course> courses = new ArrayList<Course>();
	
	PlanOfStudy(){
		
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourseList(){
		return courses;
	}

}
