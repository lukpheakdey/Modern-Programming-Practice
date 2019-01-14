package StandardExamSelfPracticePro1.March2017_prob2.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double result = 0.0;
		
		for(Employee e : list) {
			result += e.computeUpdatedBalanceSum();
		}
		return result;
	}
}
