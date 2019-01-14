package StandardExamSelfPracticePro1.March2018.prob1;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Problem1 {
		
	//A list of Customers whose checking account id has exactly the same
	//length (as a string) as the city name of that customer.
	public static List<Customer> specialCustomers(List<Account> accts) {
		//implement
//		return accts.stream()
//				.filter(x->x.getCustomer().getCheckingAccount().getId().length()==x.getCustomer().getAddress().getCity().length())
//				.map(x->x.getCustomer())
//				.collect(Collectors.toList());
		
		return accts.stream()
				.filter(x->x.getCustomer().getCheckingAccount().getId().length() == x.getCustomer().getAddress().getCity().length())
				.map(x->x.getCustomer())
				.collect(Collectors.toList());    
	}
	
	//A list of Customers, sorted by last name, 
	//whose checking account balance is less than 100 but greater than 50
	//and whose first name begins with the letter 'A'
	public static List<Customer> specialAccounts(List<Customer> custs) {
		return custs.stream()
				.filter(c -> c.getCheckingAccount().getBalance()<100)
				.filter(c -> c.getCheckingAccount().getBalance()>50)
				.filter(c -> c.getFirstName().startsWith("A"))
				.sorted(Comparator.comparing(Customer::getLastName))
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		testSpecialCustomers();
		testSpecialAccounts();
	}
	private static void testSpecialCustomers() {
		
		//Expected output: [1102: Theo Brokaw, 1101: Bobbi Jones]
		System.out.println("Customers whose checking acct id has same length as city name: " + specialCustomers(loadDataAccts()));
	}
	private static void testSpecialAccounts() {
		
		//Expected output: [105: Andrew Harvey, 104: Alan Watts, 106: Anniston West]
		System.out.println("Customers whose checking account balance is > 50 and < 100 and first name begins with 'A' " + specialAccounts(loadDataCusts()));
	}
	private static List<Customer> loadDataCusts() {
		Customer cust1 = new Customer("101", "Bob", "Jones");
		cust1.getCheckingAccount().updateBalance(100);
		Customer cust2 = new Customer("102", "Tom", "Brokaw");
		cust2.getCheckingAccount().updateBalance(150);
		Customer cust3 = new Customer("103", "Ron", "Regis");
		cust3.getCheckingAccount().updateBalance(44);
		Customer cust4 = new Customer("104", "Alan", "Watts");
		cust4.getCheckingAccount().updateBalance(56);
		Customer cust5 = new Customer("105", "Andrew", "Harvey");
		cust5.getCheckingAccount().updateBalance(84);
		Customer cust6 = new Customer("106", "Anniston", "West");
		cust6.getCheckingAccount().updateBalance(66);
		Customer cust7 = new Customer("107", "Winkie", "Bloomfield");
		cust7.getCheckingAccount().updateBalance(82);
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6, cust7);
		return list;
	}
	private static List<Account> loadDataAccts() {
		Customer cust1 = new Customer("1101", "Bobbi", "Jones");
		cust1.getCheckingAccount().updateBalance(100);
		cust1.getCheckingAccount().setId("1231235");
		cust1.addAddress(new Address("11 Barton", "Chicago", "IL", "60372"));
		
		Customer cust2 = new Customer("1102", "Theo", "Brokaw");
		cust2.getCheckingAccount().updateBalance(120);
		cust2.getCheckingAccount().setId("5639235");
		cust2.addAddress(new Address("1 Burlington", "Jenkins", "CA", "94303"));
		
		Customer cust3 = new Customer("1103", "Ornis", "Regis");
		cust3.getCheckingAccount().updateBalance(11);
		cust3.getCheckingAccount().setId("4141234");
		cust3.addAddress(new Address("23 Sawyer", "Sacramento", "CA", "94505"));
		
		Customer cust4 = new Customer("1104", "Muhammad", "Watts");
		cust4.getCheckingAccount().updateBalance(16);
		cust4.getCheckingAccount().setId("92923411");
		cust4.addAddress(new Address("131 Hawthorne", "Fairfield", "IA", "52556"));
		
		Customer cust5 = new Customer("1105", "Tiffany", "Harvey");
		cust5.getCheckingAccount().updateBalance(88);
		cust5.getCheckingAccount().setId("929123");
		cust5.addAddress(new Address("771 Ninth Ave", "Orlando", "FL", "46712"));
		
		Customer cust6 = new Customer("1106", "Trevor", "West");
		cust6.getCheckingAccount().updateBalance(43);
		cust6.getCheckingAccount().setId("44526");
		cust6.addAddress(new Address("401 Werkingson", "Moline", "IL", "60722"));
		
		Customer cust7 = new Customer("1107", "Suzie", "Bloomfield");
		cust7.getCheckingAccount().updateBalance(150);
		cust7.getCheckingAccount().setId("1775213");
		cust7.addAddress(new Address("442 Main", "Bloomington", "IN", "81144"));
		
		List<Account> list = Arrays.asList(cust1.getCheckingAccount(), 
				cust2.getCheckingAccount(), cust3.getCheckingAccount(), 
				cust4.getCheckingAccount(), cust5.getCheckingAccount(), 
				cust6.getCheckingAccount(), cust7.getCheckingAccount());
		return list;
	}
	
	
}
