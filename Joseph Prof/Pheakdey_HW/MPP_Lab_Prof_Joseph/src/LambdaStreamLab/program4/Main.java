package LambdaStreamLab.program4;

import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;
import java.util.function.Function;


import javax.swing.event.ListSelectionEvent;

import LambdaStreamLab.Solution_From_A_Student.Employee;

public class Main {

	public static void main(String[] args) {
		
		 //Employee(String firstName, String lastName, double salary, String department){

	      Employee[] employees = {
			    	         new Employee("Jason", "Red", 5000, "IT"),
			    	         new Employee("Ashley", "Green", 7600, "IT"),
			    	         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
			    	         new Employee("James", "Indigo", 4700.77, "Marketing"),
			    	         new Employee("Luke", "Indigo", 6200, "IT"),
			    	         new Employee("Jason", "Blue", 3200, "Sales"),
			    	         new Employee("Wendy", "Brown", 4236.4, "Marketing")
	    	         };

		List<Employee> listEmployee = Arrays.asList(employees);
		
		// 1. Count the number of last names that begin with the letter B
		final long countWithB = listEmployee.stream()
								.filter( e -> e.getLastName().startsWith("B"))
								.count();
		System.out.println("1. Count the number of last names that begin with the letter B : " + countWithB);
		
		// 2. Print out all of the Employee objects whose last name begins with the letter B
		System.out.println("\n2. Print out all of the Employee objects whose last name begins with the letter B :");							
		
		listEmployee.stream()
			.filter( e -> e.getLastName().startsWith("B"))
			//.map(Employee::getName)
			.map( x-> x.toString())
			.sorted()
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		// Using Functional Interface
		Function<Employee, Employee> getUpperCaseName = 
				employee -> {
					return new Employee(
								employee.getFirstName().toUpperCase(),
								employee.getLastName().toUpperCase(),
								employee.getSalary(),
								employee.getDepartment()
								);
				};
		
		System.out.println("\n3. Using Functional - Print out all of the Employee objects whose last name begins with the letter B and \nchange their first name and last name to be All capital letters : ");							
		listEmployee.stream()
			.filter( e -> e.getLastName().startsWith("B"))
			.map(getUpperCaseName)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("\n3. Print out all of the Employee objects whose last name begins with the letter B and \nchange their first name and last name to be All capital letters : ");							
		listEmployee.stream()
			.filter( e -> e.getLastName().startsWith("B"))
			.map(e -> e.toString().toUpperCase())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("\n3. Using forEach to - Print out all of the Employee objects whose last name begins with the letter B and \nchange their first name and last name to be All capital letters : ");							
		listEmployee.stream()
			.filter( e -> e.getLastName().startsWith("B"))
			.collect(Collectors.toList())
			.forEach( 
						x->{
							System.out.println(x.getFirstName().toUpperCase() 
							+ "\t" + x.getLastName().toUpperCase() 
							+ "\t" + x.getSalary() 
							+ "\t" + x.getDepartment());
						}
					);
		
		System.out.println("\n4. Print All Using Cancate: ");
		Stream.concat(
						listEmployee.stream()
							.filter(e -> !e.getLastName().startsWith("B"))
							.map(x -> x.toString()), 
						listEmployee.stream()
							.filter(e -> e.getLastName().startsWith("B"))
							.map(e -> e.toString().toUpperCase())
					).forEach(System.out::println);
		
		System.out.println("\n4. Print All Using forEach : ");
		listEmployee.stream().forEach( x -> {
				if(x.getLastName().startsWith("B"))
					x.setLastName(x.getLastName().toUpperCase());
				System.out.println(x.toString());
			});
	
		System.out.println("\n4.1 Print All Employee Join with Comma : ");
		String strList = listEmployee.stream()
					.map(Object::toString)
					.collect(Collectors.joining(", "));
		System.out.println(strList);
				
		System.out.println("\n4.2 Use the  Collectors.joining  method to print out All Employee objects \n "
								+ "and separate each one with a delimeter of  “---\\n---“ : ");
		String strList1 = listEmployee.stream()
				.map(Object::toString)
				.collect(Collectors.joining("---\n---"));
		System.out.println(strList1);
		
		
		System.out.println("\n5. Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’"
							+ "\n in sorted order, and get rid of all the duplicates.  "
							+ "\n Print out only the last names : ");
		listEmployee.stream()
					.filter( e -> e.getLastName().startsWith("I"))
					.map( e-> e.toString())
					.sorted()
					.distinct()
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		
		DoubleSummaryStatistics summary = listEmployee.stream()
										.collect(Collectors.summarizingDouble(e->e.getSalary()));
		System.out.printf("\n6. Print Average Salary : %.2f%n", summary.getAverage());
		System.out.printf("\n6. Print Min Salary : %.2f%n", summary.getMin());
		System.out.printf("\n6. Print Mix Salary : %.2f%n", summary.getMax());
		System.out.printf("\n6. Print Sum Salary : %.2f%n", summary.getSum());
		
		final double totalSalary = listEmployee.stream()
								.mapToDouble( e -> e.getSalary())
								.reduce(0, (salary1, salary2) -> salary1 + salary2);
		System.out.printf("\n7. Total Salary : %.2f%n", totalSalary);
		
		System.out.println("\n8. Print FirstName of All Employee : ");
		listEmployee.stream()
					.map( e -> e.getFirstName())
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		System.out.println("\n9. Even numbers (0, 2, 4, …) : ");
		IntStream.iterate(0, x -> x+2)
				.limit(20)
				.forEach(System.out::println);
		
		
		Main main = new Main();
		List<String> words = Arrays.asList("pheakdey", "luk", "tim", "joe", "anthony", "caleb", "tom", "bee", "bot", "tea", "att");								
		System.out.println("\nCount word that contain c not d and length = 5 : " + main.countWords(words, 'c', 'd', 5));			

		System.out.println("\nWithout functional - Count word that contain c not d and length = 5 : " + main.countWordsWithOutFunction(words, 'c', 'd', 5));
		
		
		//Level 3
		System.out.println("\n****** Level 3 ***** ");
		// group Employees by department
		System.out.println("\nEmployees by department:\n"); 
		Map<String, List<Employee>> groupedByDepartment = 
										listEmployee.stream()
										.collect(Collectors.groupingBy(Employee::getDepartment));

		groupedByDepartment.forEach((department, employeesInDepartment) -> 
			{
				System.out.println(department);
				employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));
			}
		);
				
		// printing each department and the average salary per department
		System.out.printf("%nSalaries by department:%n");
		groupedByDepartment.forEach((department, employeesInDepartment) -> 
			{
				System.out.printf("%s   $%.2f%n",department,
										employeesInDepartment.stream()
											.mapToDouble(Employee::getSalary)
											.reduce(0, (x,y) ->x + y));
			}
		);
				
		System.out.printf("%nMaximum Salary by Department%n");
		groupedByDepartment.forEach((department, employeesInDepartment) ->
			{
				System.out.printf("%s  $%.2f%n", department,
											employeesInDepartment.stream()
											.mapToDouble(Employee::getSalary)
											.max()
											.getAsDouble());
			}
		);
	}
	
	final TriFunction<String, String, Integer, Predicate<String>> coutWord = (l1, l2, len)
							-> ( w->w.contains(l1) && !w.contains(l2) && w.length() == len);
							
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter( coutWord.apply("" + c, ""+ d, len))
				.count();
	}
	
	public int countWordsWithOutFunction(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter( x->x.length()==len)
				.filter( x->x.contains(String.valueOf(c)))
				.filter( x->!x.contains(String.valueOf(d)))
				.count();
	}
																
}
