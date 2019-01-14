package April2017_Pheakdey_Sol_prob2;

public class Admin {
	//implement
	
	Department[] department = new Department[3];
	
	Admin(Department[] department) {
		this.department = department;
	}
	
	public String hourlyCompanyMessage() throws EmptyQueueException {
		String result = "";
		for(Department d : department) {
			result += format(d.getName(), d.nextMessage());
		}
		return result;
	}
	
	public String format(String name, String msg) {
		return name + " : " + msg + "\n";
	}
	
	
	
}
