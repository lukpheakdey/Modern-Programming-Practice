package grading;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import prob1.Customer;
import prob1.Problem1;


public class TestProb1 extends TestCase {
	public void testFirstMethod_Output() {
		List<String> expected = Arrays.asList(new String[] {"tree", "bike"});
		List<String> list1 = Arrays.asList(new String[]{"friend", "tree", "bike", "bat"});
		List<String> list2 = Arrays.asList(new String[]{"tree", "strong", "bike", "weak"});
		List<String> output = Problem1.elementsInBoth(list1, list2);
		assertTrue("Problem 1, first problem: Expected 'tree', 'bike', but got " + output, Auxil.sameElements(expected, output));
	}
	
	//[54672, 57532]
	public void testSecondMethod_CorrectElements() {
		List<String> expected = Arrays.asList("54672", "57532");
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Oskaloosa", "54672");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "10 Adams", "Fairfield", "52556");
		Customer cust7 = new Customer("Tom", "211 Blake Ave", "Oskaloosa", "54672");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6, cust7);
		List<String> studentResult = Problem1.getZipsOfSpecialCustomers(list);
		assertTrue("Problem 1, first problem: Expected '54672', '57532' but got " + studentResult, 
				Auxil.sameElements(expected, studentResult));
	}
	
	public void testSecondMethod_CorrectlySorted() {
		List<String> expected = Arrays.asList("54672", "57532");
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Oskaloosa", "54672");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "10 Adams", "Fairfield", "52556");
		Customer cust7 = new Customer("Tom", "211 Blake Ave", "Oskaloosa", "54672");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6, cust7);
		List<String> studentResult = Problem1.getZipsOfSpecialCustomers(list);
		if(!Auxil.sameElements(expected, studentResult)) {
			System.out.println("Did not test for correct sorted order since elements of output list are not correct");
		} else {
			assertEquals("Elements of output list are correct but not in correct sorted order", expected, studentResult);
		}
	}
	
	public void test_UsedForLoop() {
		String pathToProblem1 = "\\src\\prob1\\Problem1.java";
		assertFalse("Student's code uses a for loop", Auxil.usesForLoop(pathToProblem1));
	}
	
	public void test_UsedWhileLoop() {
		String pathToProblem1 = "\\src\\prob1\\Problem1.java";
		assertFalse("Student's code uses a while loop", Auxil.usesWhileLoop(pathToProblem1));
	}
 
	
		
	
}
