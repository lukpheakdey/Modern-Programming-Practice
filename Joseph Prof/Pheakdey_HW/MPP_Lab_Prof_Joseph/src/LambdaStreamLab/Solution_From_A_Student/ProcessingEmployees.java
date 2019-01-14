package LambdaStreamLab.Solution_From_A_Student;

import java.util.ArrayList;
//Program 4: ProcessingEmployees.java
//Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees
{
	public static void main(String[] args)
	{
		// initialize array of Employees
		Employee[] employees = {
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"),
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing")};

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);   //A method reference.
   
//		// Predicate (boolean-valued function) that returns true for salaries 
//		//in the range $4000-$6000
//		Predicate<Employee> fourToSixThousand = 
//				e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
//
//		// 	Display Employees with salaries in the range $4000-$6000
//		// sorted into ascending order by salary
//		System.out.printf(
//			"%nEmployees earning $4000-$6000 per month sorted by salary:%n");
//
//		list.stream()
//			.filter(fourToSixThousand)
//			.sorted(Comparator.comparing(Employee::getSalary))
//			.forEach(System.out::println);
//
//		// Display first Employee with salary in the range $4000-$6000
//		System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
//			list.stream()
//				.filter(fourToSixThousand)
//				.findFirst()
//				.get());
//
//		// Functions for getting first and last names from an Employee
//		Function<Employee, String> byFirstName = Employee::getFirstName;
//		Function<Employee, String> byLastName = Employee::getLastName;
//
//		// Comparator for comparing Employees by first name then last name
//		Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
//
//		// sort employees by last name, then first name 
//		System.out.printf("%nEmployees in ascending order by last name then first:%n");
//		list.stream()
//			.sorted(lastThenFirst)
//			.forEach(System.out::println);
//
//		// sort employees in descending order by last name, then first name
//		System.out.printf("%nEmployees in descending order by last name then first:%n");
//		list.stream()
//			.sorted(lastThenFirst.reversed())
//			.forEach(System.out::println);
//
//		// display unique employee last names sorted
//		System.out.printf("%nUnique employee last names:%n");
//		list.stream()
//			.map(Employee::getLastName)
//			.distinct()
//			.sorted()
//			.forEach(System.out::println);
//
//		// display only first and last names
//		System.out.printf("%nEmployee names in order by last name then first name:%n"); 
//		list.stream()
//			.sorted(lastThenFirst)
//			.map(Employee::getName)
//			.forEach(System.out::println);
//
//		// group Employees by department
//		System.out.printf("%nEmployees by department:%n"); 
//		Map<String, List<Employee>> groupedByDepartment =
//			list.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment));
//
//		groupedByDepartment.forEach((department, employeesInDepartment) -> 
//			{
//				System.out.println(department);
//				employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));
//			}
//		);
//
//		// count number of Employees in each department
//		System.out.printf("%nCount of Employees by department:%n"); 
//
//		Map<String, Long> employeeCountByDepartment =
//				list.stream()
//					.collect(Collectors.groupingBy(Employee::getDepartment, 
//							TreeMap::new, Collectors.counting()));
//
//		employeeCountByDepartment.forEach((department, count) -> System.out.printf(
//         "%s has %d employee(s)%n", department, count));
//
//		/*  Output looks something like :
//
//     	HR  4
//     	IT  8
//     	Sales  12
//		 */
//
//
//		// sum of Employee salaries with DoubleStream sum method
//		System.out.printf(
//				"%nSum of Employees' salaries (via sum method): %.2f%n",
//				list.stream()
//					.mapToDouble(Employee::getSalary)
//					.sum());
//
//		// calculate sum of Employee salaries with Stream reduce method
//		System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
//			list.stream()
//				.mapToDouble(Employee::getSalary)
//				.reduce(0, (value1, value2) -> value1 + value2));  
//
//		// average of Employee salaries with DoubleStream average method
//		System.out.printf("Average of Employees' salaries: %.2f%n",
//			list.stream()
//				.mapToDouble(Employee::getSalary)
//				.average()
//				.getAsDouble());
		
		//..............................................................................................
		// print out the number of employees whose last name begins with 'B'
		System.out.println();
		System.out.printf("Number of employees whose last name begins with 'B': %d%n", 
			list.stream()
				.filter(e -> e.getLastName().startsWith("B"))
				.count());
		
		System.out.println();
		// print out the employees whose last name starts with 'B'
		System.out.println("Employees whose last name begis with 'B':"); 
		list.stream()
			.filter(e -> e.getLastName().startsWith("B"))
			.forEach(System.out::println);
		
		System.out.println();
		
		// print out all the employees capitalize the last letter of those that start with 'B'
		System.out.println("Print all employees and capitalize the ones that starts with 'B'");
		list.stream()
			.forEach(e -> {
				if (e.getLastName().startsWith("B")) e.setLastName(e.getLastName().toUpperCase());
				System.out.println(e);
			});
		
		// using concatenation to solve this problem
		System.out.println("Using concatenation to solve the problem above");
		Stream<Employee> empStream = 
						list.stream()
						.filter(e -> e.getLastName().startsWith("B"))
						.map(e -> new Employee(
											e.getFirstName(), 
											e.getLastName().toUpperCase(), 
											e.getSalary(), 
											e.getDepartment()
										)
								);
		Stream<Employee> empStream2 = 
						list.stream()
						.filter(e -> !e.getLastName().startsWith("B"));
		
		Stream.concat(empStream2, empStream).forEach(System.out::println);
		
		
		// creating a new list to store both of the capital and non capital
		System.out.println("\nPrinting a list of both the capital and non capital lastnames employees");
		List<Employee> empList = Stream.concat(empStream, empStream2)
									.collect(Collectors.toList());
		empList.forEach(System.out::println);
		
		
		// print out all the distint last names whose last name starts with I
		System.out.println();
		System.out.println("Print out all the distinct last names whose last name starts with I");
		list.stream()
			.filter(e -> e.getLastName().startsWith("I"))
			.map(Employee::getLastName)
			.distinct()
			.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println();
		// print the average salary
		System.out.printf("The averages of the salaries is $%.2f%n", 
				list.stream()
					.mapToDouble(Employee::getSalary)
					.average()
					.getAsDouble());
		
		System.out.println();
		// print the total salaries
		System.out.printf("The total salary of the employees is $%.2f%n", 
				list.stream()
					.mapToDouble(Employee::getSalary)
					.reduce(0, (x,y) -> x + y));
		
		System.out.println();
		// print the first names of the employees
		System.out.println("The first names of the employees are ");
		list.stream()
			.map(Employee::getFirstName)
			.forEach(System.out::println);
		
		System.out.println();
		// print the first 20 even numbers
		System.out.println("The first 20 even numbers are ");
		IntStream.iterate(2, i -> i +2)
			.limit(20)
			.forEach(System.out::println);
		
		List<String> stList = new ArrayList<>();
		stList.add("Fade");
		stList.add("Sola");
		stList.add("abc");
		
		System.out.println(".........................");
		System.out.printf("The result of the method countWords is: %d%n", 
				countWords(stList, 'F', 'S', 4));
		
		// group Employees by department
		System.out.printf("%nEmployees by department:%n"); 
		Map<String, List<Employee>> groupedByDepartment =
			list.stream()
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

	} // end main
	
	public static int countWords(List<String> words, char c, char d, int len) {
		Predicate<String> filterString = 
				st -> (st.length() == len && st.contains(String.valueOf(c)) && 
				!st.contains(String.valueOf(d)));
		int result = (int) words.stream()
						.filter(filterString)
						.count();
		
		return result;
						
	}
} // end class ProcessingEmployees

