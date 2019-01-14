package StandardExamSelfPracticePro1.March2018_1.prob2.admin;
import java.time.LocalDate;
import java.util.*;
import StandardExamSelfPracticePro1.March2018_1.prob2.*;
public class Main {

	public static void main(String[] args) {
		List<Student> allStudents = createTestData();
		List<Course> taughtByValentine = coursesTaughtByValentine(allStudents);
		System.out.println(taughtByValentine);

	}
	
	/* Returns a list of courses that input list of students took at one time
	 * whose primary professor was Valentine.
	 * The list of courses must not contain duplicates.
	 * 
	 * Expected output using the test data:
	 *         [Math: Valentine, Chemistry: Valentine]    
	 */
	public static List<Course> coursesTaughtByValentine(List<Student> allStudents) {
		List<Course> coursesFound = new ArrayList<Course>();

//		for(Student s : allStudents) {
//			for(Course c : s.getPlanOfStudy().getCourseList()) {
//				if(c.getPrimaryProfessor().equals("Valentine"))
//					if(!coursesFound.contains(c)) {
//						coursesFound.add(c);
//					}
//			}
//		}
		
		for(Student s : allStudents) {
			for(TranscriptEntry t : s.getTranscript().getTranscriptEntries()) {
				if(t.getCours().getPrimaryProfessor().equals("Valentine")) {
					if(!coursesFound.contains(t.getCours())) {
						coursesFound.add(t.getCours());
					}
				}
			}
		}
		return coursesFound;
	}
	
	private static List<Student> createTestData() {
		/* uncomment when your code is ready to be tested */
		List<Course> allCourses = new ArrayList<Course>() {
			{
				add(new Course("Math", "Valentine"));
				add(new Course("Biology", "Stevens"));
				add(new Course("Chemistry", "Valentine"));
				add(new Course("Literature", "Robbins"));
				add(new Course("ComputerScience", "Corazza"));
			}
		};
		
		Student[] students = {
				new Student("Joe", "Kimball"),
				new Student("Ralph", "Bunker"),
				new Student("Dave", "Arnold"),
				new Student("Rhoda", "Johnson"),
				new Student("Semke", "Fioris"),
				new Student("Anna", "Martinez"),
				new Student("Florentine", "Pembroke")
		};
		int[][] someNumbers = {
				{0, 2, 4}, {1,3,4}, {4,1,0}, {0,2,3,4}, {4,2,3},{2,4}, {0, 3,4}
		};
		
		String[][] someGrades = {
			{"A", "B"}, {"B", "B"}, {"B", "C"}, {"C", "C"}, {"B", "B"}, {"B", "C"}, {"C","A"}
		};
		
		//Populate each student's plan of study and transcript
		for(int i = 0; i < students.length; ++i) {
			Student s = students[i];
			PlanOfStudy plan = s.getPlanOfStudy();
			int[] choices = someNumbers[i];
			for(int j=0; j< choices.length; ++j) {
				plan.addCourse(allCourses.get(choices[j]));
			}
			Transcript transcript = s.getTranscript();
			transcript.addTranscriptEntry(LocalDate.of(2016, 11, 1), someGrades[i][0], 
					allCourses.get(choices[0]));
			transcript.addTranscriptEntry(LocalDate.of(2016, 11, 1), someGrades[i][1], 
					allCourses.get(choices[1]));
				
		}
		return Arrays.asList(students); 
	}

}
