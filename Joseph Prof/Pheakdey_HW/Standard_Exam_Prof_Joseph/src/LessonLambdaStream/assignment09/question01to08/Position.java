package assignment09.question01to08;

import java.util.*;
import java.util.function.Consumer;

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

	public void print()
	{
		System.out.println("\tPosition: " + getTitle() + " Description: " + getDescription());
		employees.forEach(item-> 
		{
			item.print();
		});
		
	}
	
	double totalSalary;
	public double getSalary()
	{
		totalSalary=0;
		employees.forEach(item-> 
		{
			totalSalary = totalSalary + item.getSalary();
		});
		
		
		return totalSalary;
	}
	//lab 3
	public ArrayList<Position> downlinePosition = new ArrayList<Position>();
	public boolean isDepartmentHead;
	static int countTab  = 2;
	public void printdownline()
	{
		String Tab="";
		for(int ctab = 1 ; ctab <= countTab;ctab++ )
		{
			Tab= Tab + "\t";
		}
		
		
		for ( int i=0; i < downlinePosition.size() ;i++ )
		{
			Position dlp = downlinePosition.get(i);
			
			System.out.println(Tab + "Position: " + dlp.getTitle() + " Description: " + dlp.getDescription());
			
			for (Employee item : dlp.employees)
			{
				
				item.Tab= Tab;
				item.print();
				
			}
			if ( dlp.downlinePosition.size() > 0)
			{
				countTab ++;
			    dlp.printdownline();
			}
		
		}

		
		
		
	}
	//lab 3

	@Override
	public int hashCode() {
		int result = 17;
		result += 31 * result + ((description == null) ? 0 : description.hashCode());
		result += 31 * result +  ((downlinePosition == null) ? 0 : downlinePosition.hashCode());
		//result += 31 * result +   ((employees == null) ? 0 : employees.hashCode());
		result += 31 * result + (isDepartmentHead ? 1231 : 1237);
		result += 31 * result+ ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object position) {
		
		//check null
		if (position== null)
			 return false;
	    // check class name
		if(this.getClass() != position.getClass()) 
			 return false;
		// downcast 
		Position pos = (Position) position;
		
		if (description == null) {
			if (pos.description != null)
				return false;
		} else if (!description.equals(pos.description))
			return false;
		if (downlinePosition == null) {
			if (pos.downlinePosition != null)
				return false;
		} else if (!downlinePosition.equals(pos.downlinePosition))
			return false;
		if (employees == null) {
			if (pos.employees != null)
				return false;
		} else if (!employees.equals(pos.employees))
		{

			return false;
			
			
		}
		
		if (isDepartmentHead != pos.isDepartmentHead)
			return false;
		if (title == null) {
			if (pos.title != null)
				return false;
		} else if (!title.equals(pos.title))
			return false;
		
		
		return true;
	}
/*
	Consumer<Position> consumer = new Consumer()
			{
		      @Override
		      public void accept(Object obj)
		      {
		    	  //downcast
		    	 Position pos = (Position) obj;
		    	 System.out.println("\n"+pos);
		    	 
		      }

			
			};
	
	*/
	@Override
	public String toString() {
		String str= "[Title:" + title + ", Description=" + description
			    + ", DepartmentHead=" + isDepartmentHead + "]";
		
		if (downlinePosition!=null)
		{
			if (downlinePosition.size() >0)
			{   str+= "\n" + "Downline:";
				for (Position pos : downlinePosition)
				{
					str+= pos;
				}
			}
		}
		
		return str;
		
	}

}
