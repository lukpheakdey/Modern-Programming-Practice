package lab3.lab3_3;

import java.util.*;
import java.util.ArrayList;

public class Position {

	public ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Position(String title,String description) {
		this.title = title;
		this.description = description;
	}
	
	private String title;
	private String description;

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void print(){
		System.out.println("\tPosition: " + getTitle() + " Description: " + getDescription());
		employees.forEach(x-> 
		{
			x.print();
		});
	}
	
	double totalSalary;
	
	public double getSalary() {
		totalSalary=0;
		employees.forEach(item-> 
		{
			totalSalary = totalSalary + item.getSalary();
		});
		return totalSalary;
	}
	
	// Lab3_3
	public ArrayList<Position> downlinePosition = new ArrayList<Position>();
	public boolean isDepartmentHead;
	static int countTab  = 2;
	
	public void printdownline()
	{
		String Tab="";
		for(int ctab = 1 ; ctab <= countTab;ctab++ ){
			Tab = Tab + "\t";
		}
		
		for ( int i=0; i < downlinePosition.size() ;i++ ){
			Position dlp = downlinePosition.get(i);
			System.out.println(Tab + "Position: " + dlp.getTitle() + " Description: " + dlp.getDescription());
			for (Employee item : dlp.employees){
				System.out.println("\t");
				item.print();
			}
			if ( dlp.downlinePosition.size() > 0){
				countTab ++;
			    dlp.printdownline();
			}
		}
	}
	// Lab 3_3

}
