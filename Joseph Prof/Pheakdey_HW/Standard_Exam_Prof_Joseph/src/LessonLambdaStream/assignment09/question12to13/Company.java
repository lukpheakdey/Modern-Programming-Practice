package assignment09.question12to13;

import java.text.DecimalFormat;
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
	public void getSalary()
	{
		totalSalary= 0;
		departments.forEach(item-> 
		{
			totalSalary = totalSalary + item.getSalary();
		});
		
		
        System.out.println("----------------------------------------------------------------");
		System.out.printf("Total Amount is $%,.2f " ,totalSalary);
		

	}
	
	//lab3
	public void printReportingHierarchy()
	{
		System.out.println("Company: " + getName());
		System.out.println("*******************************Top Executive******************");
		getTopExecutive().print();
		System.out.println("**************************************************************");
		
		departments.forEach(item-> 
		{
			if (item.getName()!=null)
			{
		    
			   item.printReportingHierarchy();
			
			}
		});
	}
	
	Position exec;
	public Position getTopExecutive()
	{
		
		departments.forEach(item-> 
		{
			// to check if executive
			if (item.getName()==null)
			{
		   
				item.positions.forEach( posItem ->
				{
					exec = posItem;
					
				});
				
			
			}
		});
		
		return exec;
	}
	//lab3

}
