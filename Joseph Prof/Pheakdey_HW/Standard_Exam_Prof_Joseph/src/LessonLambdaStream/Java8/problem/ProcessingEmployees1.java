package programcontest;


// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees1
{
   public static void main(String[] args)
   {
      // 1. Initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      
      List<Employee> list = Arrays.asList(employees);

      // 1. display all Employees using forEach [ 1 Points ]
     
      
      
      
      
      

      // 2. Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary [ 3 Points ]
     
         
         
  
      
      

           
      
      // 3. Comparator for comparing Employees by first name then last name [ 3 Points ]
     
      
      

       
            
      

      // 4. display unique employee last names in sorted order [ 3 Points ]
     
      
      
      
      
      

      
      // 5. group Employees by department to Map 
      // with Department name as a key and List of employees as values and print the result [ 4 Points ]
     
      
      
      
      

      // 6.Count number of Employees in each department to map with 
      // Department as key and department count as value and print the result [ 3 Points ]
     
      
      
      
      
    
      
      // 7. calculate sum of Employee salaries with Stream reduce method [ 3 Points ]
     
      
      
      

      // 8. Find an employee who has the first name "Andy" in the list, 
  	//check null using Optional isPresent() or orElse to avoid NullPointerException [ 4 Points ]
      
      
      
      
      //9. Create an object using ClassName::new for the Employee class by defining your own Interface [ 3 Points ]
      
      
      
      
           
   /*10.  Create a lambda library for the given query and test it
   // Hint : Lambda Library, identify the parameters that are combined together 
    * in your pipeline, and consider those to be arguments for some kind of 
    * Java function-type interface [3 Points] */   
		
   			List<String> l2 = list.stream()
   			.filter((x) -> x.getLastName().startsWith("I"))
   			.peek(System.out::println)
   			.map(Employee::getLastName)
   			.sorted()
   			.collect(Collectors.toList());
   			System.out.println(l2);
   			
      
   } // end main
} // end class ProcessingEmployees

 