package W2D3_Comparable_Comparator.Comparable;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		TreeSet <Employee> list = new TreeSet <Employee> ();
		Employee e1 = new Employee("LLL", 5);
		Employee e2 = new Employee("TTT", 1);
		Employee e3 = new Employee("AAA", 3);
		Employee e4 = new Employee("BBB", 2);
		
		String s1 = new String("hello");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Iterator <Employee> i1 = list.iterator();
		
		while (i1.hasNext()){
			Employee eTemp = i1.next();
			System.out.println (eTemp.getAge());
		}
	} // main ends		
}

