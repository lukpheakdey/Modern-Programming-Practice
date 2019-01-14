package Lab5_1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[4];
		
		Employee emp1Salary = emp[0] = new Salaried("0001", 1200000);
		Employee emp2Hourly = emp[1] = new Hourly("0002", 48, 4);
		
		List<Order> order1 = Arrays.asList(new Order("IN00001", LocalDate.of(2018, 11, 01), 100));
		Employee emp3Commission = emp[2] = new Commissioned("0003", 0.10, 3000, order1);
		
		List<Order> order2 = Arrays.asList(
								new Order("IN00002", LocalDate.of(2018, 11, 01), 200),
								new Order("IN00003", LocalDate.of(2018, 11, 01), 300)
							);
		
		Employee emp4Commision = emp[3] = new Commissioned("0004", 0.20, 400, order2);

		System.out.println("**** Salary *****");
		emp1Salary.print();
		
		System.out.println("**** Hourly *****");
		emp2Hourly.print();
		
		System.out.println("**** One Order with Commissioned *****");
		emp3Commission.print();
		
		System.out.println("**** Two Order with Commissioned *****");
		emp4Commision.print();
		
	}

}
