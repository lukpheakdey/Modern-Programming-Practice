package lab3.lab3_3;

import java.util.*;

public class Company {
	
	public  ArrayList<Department> departments;
	
	public Company(String name) {
		this.name= name;
		departments = new ArrayList<Department>();
	}
	
	private String name;
	public String getName() {
		return name;
	}
	
	public void print()
	{
		System.out.println("Company: " + getName());
		departments.forEach(item-> 
		{
			item.print();
		});
	}
	
	double totalSalary;
	public void getSalary(){
		totalSalary = 0;
		departments.forEach(x-> 
		{
			totalSalary = totalSalary + x.getSalary();
		});
        System.out.println("----------------------------------------------------------------");
		System.out.printf("Total Amount is $%,.2f " ,totalSalary);
	}
	
	// Lab3_3
	public void printReportingHierarchy(){
		System.out.println("Company: " + getName());
		System.out.println("******************************* Top Executive ******************");
		getTopExecutive().print();
		System.out.println("**************************************************************");
		
		departments.forEach(x-> 
		{
			if (x.getName()!=null){
			   x.printReportingHierarchy();
			}
		});
	}
	
	Position pos;
	public Position getTopExecutive(){
		departments.forEach(x-> 
		{
			// to check if executive
			if (x.getName()==null){
				x.positions.forEach( posItem ->
				{
					pos = posItem;
				});
			}
		});
		return pos;
	}
}