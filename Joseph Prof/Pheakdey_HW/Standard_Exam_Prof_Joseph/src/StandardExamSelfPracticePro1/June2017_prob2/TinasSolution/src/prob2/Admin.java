package prob2;

import java.util.*;

public class Admin {
	/**
	 * Returns the average gpa for all students in the studentList
	 */
	public static double computeAverageGpa(List<Student> studentList) {

//		double sum = 0;
//		for (Student s : studentList) {
//			sum += s.computeGpa();
//		}
//
//		return sum / studentList.size();
		
		return studentList.stream().mapToDouble(s -> s.computeGpa()).average().getAsDouble();
	}
}
