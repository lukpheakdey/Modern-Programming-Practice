package grading;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import prob2.Admin;
import prob2.FulltimeStudent;
import prob2.FulltimeTranscriptRecord;
import prob2.ParttimeStudent;
import prob2.ParttimeTranscriptRecord;
import prob2.SemesterTranscript;
import prob2.Student;


public class TestProb2 extends TestCase {
	
	public void testComputeGpa() {
		//correct output is 3.1347222222222224 
		double lower = 3.13472;
		double upper = 3.13473;
		List<Student> students = prepareTestData();
		double result = Admin.computeAverageGpa(students);
		assertTrue(lower < result && result < upper);		
	}
	
	
	/////////////// Check instance variables, methods, constructors, relationships ////////////////	
	public void testInheritance() {
		assertTrue("Expected FulltimeStudent to inherit from Student",
				Auxil.inheritsFrom(FulltimeStudent.class, Student.class));
		assertTrue("Expected ParttimeStudent to inherit from Student",
				Auxil.inheritsFrom(ParttimeStudent.class, Student.class));
	}
	public void testStudentDesignElements() {
		//inst variable
		Class<Student> cl = Student.class;
		assertTrue("Expected variable 'name' in Student", Auxil.containsInstVariable(cl, "name"));
		//inst methods
		assertTrue("Expected method 'getName' in Student", Auxil.containsMethod(cl, "getName"));
		assertTrue("Expected method 'computeGpa' in Student", Auxil.containsMethod(cl, "computeGpa"));
		//abstract methods
		if(Auxil.containsMethod(cl, "computeGpa")) {
			assertTrue("Expected 'computeGpa' method to be abstract", Auxil.methodIsAbstract(cl, "computeGpa"));
		}
		//constructor
		assertTrue("Expected explicitly defined constructor Student", Auxil.containsConstructor(cl, "Student"));
		assertTrue("Expected constructor Student to have one argument", 
				Auxil.constructorHasCorrectNumParams(cl, "Student", 1));
		
	}
	//Also checks that FulltimeStudent composes a FulltimeTranscriptRecord
	public void testFulltimeStudentDesignElements() {	
		Class<FulltimeStudent> cl = FulltimeStudent.class;
		//inst variable
		assertTrue("Expected variable of type FullTimeTranscriptRecord in FulltimeStudent", 
				Auxil.containsInstVariableType(cl, FulltimeTranscriptRecord.class));
		//constructor
		assertTrue("Expected explicitly defined constructor FulltimeStudent", Auxil.containsConstructor(cl, "FulltimeStudent"));
		assertTrue("Expected constructor FulltimeStudent to have two arguments", 
				Auxil.constructorHasCorrectNumParams(cl, "FulltimeStudent", 2));
	}
	
	//Also checks that ParttimeStudent composes a ParttimeTranscriptRecord
	public void testParttimeStudentDesignElements() {
		Class<ParttimeStudent> cl = ParttimeStudent.class;
		//inst variable
		assertTrue("Expected variable of type PartTimeTranscriptRecord in ParttimeStudent", 
				Auxil.containsInstVariableType(cl, ParttimeTranscriptRecord.class));
		//constructor
		assertTrue("Expected explicitly defined constructor ParttimeStudent", Auxil.containsConstructor(cl, "ParttimeStudent"));
		assertTrue("Expected constructor ParttimeStudent to have two arguments", 
				Auxil.constructorHasCorrectNumParams(cl, "ParttimeStudent", 2));
	}
	public void testFulltimeTranscriptRecordDesignElements() {
		Class<FulltimeTranscriptRecord> cl = FulltimeTranscriptRecord.class;
		//inst variable
		assertTrue("Expected variable of type SemesterTranscript in FulltimeTranscriptRecord", 
				Auxil.containsInstVariableType(cl, SemesterTranscript.class));
		//instance methods
		String[] methodNames = {"getFallTranscript", "getSpringTranscript", "setFallTranscript", "setSpringTranscript"};
		for(String mName : methodNames) {
			assertTrue("Expected method '" + mName + "' in FulltimeTranscriptRecord", 
					Auxil.containsMethod(cl, mName));
		}
		if(Auxil.containsMethod(cl, "getFallTranscript")) {
			assertTrue(Auxil.methodHasCorrectReturnType(cl, "getFallTranscript", SemesterTranscript.class));
		}
		if(Auxil.containsMethod(cl, "getSpringTranscript")) {
			assertTrue(Auxil.methodHasCorrectReturnType(cl, "getSpringTranscript", SemesterTranscript.class));
		}
	}
	public void testParttimeTranscriptRecordDesignElements() {
		Class<ParttimeTranscriptRecord> cl = ParttimeTranscriptRecord.class;
		//inst variable
		assertTrue("Expected variable 'grades' in ParttimeTranscriptRecord", Auxil.containsInstVariable(cl, "grades"));
		assertTrue("Expected variable 'grades' in ParttimeTranscriptRecord to have type List", 
				Auxil.containsInstVariableType(cl, java.util.List.class));
		//inst methods
		String[] methodNames = {"getGrades", "insertGrade"};
		for(String mName : methodNames) {
			assertTrue("Expected method '" + mName + "' in ParttimeTranscriptRecord", 
					Auxil.containsMethod(cl, mName));
		}
		if(Auxil.containsMethod(cl, "getGrades")) {
			assertTrue("Expected getGrades in ParttimeTranscriptRecord to return a list", 
					Auxil.methodHasCorrectReturnType(cl, "getGrades", java.util.List.class));
		}
		if(Auxil.containsMethod(cl, "insertGrade")) {
			assertTrue("Expected insertGrade in ParttimeTranscriptRecord to accept an argument of type 'double' or 'Double'",
					Auxil.methodHasCorrectArguments(cl, "insertGrade", new Class<?>[] {Double.class}, new String[]{"double"}));
		}
		
	}
	public void testSemesterTranscriptDesignElements() {
		Class<SemesterTranscript> cl = SemesterTranscript.class;
		//inst variable
		assertTrue("Expected variable 'grades' in SemesterTranscript", Auxil.containsInstVariable(cl, "grades"));
		assertTrue("Expected variable 'grades' in SemesterTranscript to have type List", 
				Auxil.containsInstVariableType(cl, java.util.List.class));
		//inst methods
		String[] methodNames = {"getGrades", "insertGrade"};
		for(String mName : methodNames) {
			assertTrue("Expected method '" + mName + "' in SemesterTranscript", 
					Auxil.containsMethod(cl, mName));
		}
		if(Auxil.containsMethod(cl, "getGrades")) {
			assertTrue("Expected getGrades in SemesterTranscript to return a list", 
					Auxil.methodHasCorrectReturnType(cl, "getGrades", java.util.List.class));
		}
		if(Auxil.containsMethod(cl, "insertGrade")) {
			assertTrue("Expected insertGrade in SemesterTranscript to accept an argument of type 'double' or 'Double'",
					Auxil.methodHasCorrectArguments(cl, "insertGrade", new Class<?>[] {Double.class}, new String[]{"double"}));
		}
	}
	
	//////////// prepare test data for computeGpa test //////////////
	private static List<Student> prepareTestData() {
	
		FulltimeTranscriptRecord ftr1 = new FulltimeTranscriptRecord();
		FulltimeTranscriptRecord ftr2 = new FulltimeTranscriptRecord();
		FulltimeTranscriptRecord ftr3 = new FulltimeTranscriptRecord();
		
		SemesterTranscript st1 = new SemesterTranscript();
		st1.insertGrade(3.1);st1.insertGrade(2.8);st1.insertGrade(3.8);st1.insertGrade(4.0);
		SemesterTranscript st2 = new SemesterTranscript();
		st2.insertGrade(3.3);st2.insertGrade(3.8);st2.insertGrade(2.8);st2.insertGrade(3.0);
		SemesterTranscript st3 = new SemesterTranscript();
		st3.insertGrade(3.3);st3.insertGrade(3.8);st3.insertGrade(2.8);st3.insertGrade(3.0);
		SemesterTranscript st4 = new SemesterTranscript();
		st4.insertGrade(3.3);st4.insertGrade(3.8);st4.insertGrade(2.8);st4.insertGrade(3.0);
		SemesterTranscript st5 = new SemesterTranscript();
		st5.insertGrade(3.3);st5.insertGrade(3.8);st5.insertGrade(2.8);st5.insertGrade(3.0);
		SemesterTranscript st6 = new SemesterTranscript();
		st6.insertGrade(3.3);st6.insertGrade(3.8);st6.insertGrade(2.8);st6.insertGrade(3.0);
		
		ftr1.setFallTranscript(st1);
		ftr1.setSpringTranscript(st2);
		ftr2.setFallTranscript(st3);
		ftr2.setSpringTranscript(st4);
		ftr3.setFallTranscript(st5);
		ftr3.setSpringTranscript(st6);
		
		ParttimeTranscriptRecord ptr1 = new ParttimeTranscriptRecord();
		ptr1.insertGrade(1.8);ptr1.insertGrade(2.7);ptr1.insertGrade(3.1);
		ParttimeTranscriptRecord ptr2 = new ParttimeTranscriptRecord();
		ptr2.insertGrade(3.8);ptr2.insertGrade(3.7);
		ParttimeTranscriptRecord ptr3 = new ParttimeTranscriptRecord();
		ptr3.insertGrade(2.3);ptr3.insertGrade(2.7);ptr3.insertGrade(2.1);ptr3.insertGrade(3.9);
		
		FulltimeStudent fts1 = new FulltimeStudent("Bob", ftr1);
		FulltimeStudent fts2 = new FulltimeStudent("Alice", ftr2);
		FulltimeStudent fts3 = new FulltimeStudent("Rick", ftr3);
		
		ParttimeStudent pts1 = new ParttimeStudent("Jonah", ptr1);
		ParttimeStudent pts2 = new ParttimeStudent("Mark", ptr2);
		ParttimeStudent pts3 = new ParttimeStudent("Steve", ptr3);
		
		
		Student[] students = {fts1, fts2, fts3, pts1, pts2, pts3};
		List<Student> studentList = Arrays.asList(students);
		return studentList;

	
	}
}
