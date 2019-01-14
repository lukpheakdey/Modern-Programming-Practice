package March2017_Pheakdey_Sol.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		//done
		
		double updateSum = 0.0;
		for(Employee e : list) {
			updateSum += e.computeUpdatedBalanceSum();
		}
		return updateSum;
	}
}
