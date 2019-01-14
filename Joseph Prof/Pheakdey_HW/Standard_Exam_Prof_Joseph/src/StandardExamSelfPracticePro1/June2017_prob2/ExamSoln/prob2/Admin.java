package prob2;

import java.util.*;

public class Admin {
	
	public static double computeAverageGpa(List<Student> studentList) {
		double totalGpa = 0.0;
		if(studentList.isEmpty()) return 0.0;
		for(Student s : studentList) {
			totalGpa += s.computeGpa();
		}
		return totalGpa / studentList.size();
	}
}
