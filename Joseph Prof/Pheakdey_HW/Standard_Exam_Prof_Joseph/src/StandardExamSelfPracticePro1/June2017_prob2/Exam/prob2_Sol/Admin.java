package StandardExamSelfPracticePro1.June2017_prob2.Exam.prob2_Sol;

import java.util.*;

public class Admin {
	/**
	 * Returns the average gpa for all students in the studentList
     */
	public static double computeAverageGpa(List<Student> studentList) {
		//implement
		double result = 0.0;
		for(Student stu : studentList) {
			result += stu.computeGpa();
		}
		return result/studentList.size();
	}
}
