package ExtraCredit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ACustomer implements ICustomer{
	
	//Association
	private ArrayList<Order> orders;
	public  void createOrder(Order order){
		orders.add(order);
	}
	
	//Attributes
	private String name;
	private String address;
	private String phone;
	private double points;
	
	//Constructor
	public ACustomer( String name,String address,String phone){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.orders = new ArrayList<Order>();
	}

	//Methods
	public abstract CreditRating getCreditRating(); 
	public abstract void setCreditRating(CreditRating creditRating);
	
	private boolean isgenerateMonthlyBill;
	
	public void setisgenerateMonthlyBill( boolean isgenerateMonthlyBill){
		this.isgenerateMonthlyBill=isgenerateMonthlyBill;
	}
	
	public void printOrders(){
		
		if (isgenerateMonthlyBill){
			System.out.println("********************************************************************");
			System.out.println("*********************MONTHLY GENERATED BILL************************");
		}
	  	
		System.out.println("********************************************************************");
		System.out.println("NAME: \t\t"+ this.name );
		System.out.println("ADDRESS: \t"+ this.address );
		System.out.println("PHONE: \t\t"+ this.phone );
		System.out.println("CREDIT RATING: \t"+ this.getCreditRating() );
		System.out.println("TYPE: \t\t" + this.getClass().getSimpleName());
		System.out.println("--------------------------------------------------------------------");

		if (isgenerateMonthlyBill== false){ 
		
		Collections.sort(orders, new Comparator<Order>() {
			public int compare(Order o1, Order o2) {
				return o1.getOrderdate().compareTo(o2.getOrderdate());
			}
		}); 
		  
		for ( Order item : orders ){
			item.printOrder();
			}
		}
		else {
			Collections.sort(orders, new Comparator<Order>() {
				public int compare(Order o1, Order o2) {
					return o1.getOrderdate().compareTo(o2.getOrderdate());
				}
			});
		  
			String month=""; 
			String previousMonth=""; 
			for ( Order item :  orders){  
				if(item.getPrepaid()== false) {
					SimpleDateFormat formt = new SimpleDateFormat("MMMM");
					month =  formt.format(item.getOrderdate()); 
					if (month.isEmpty() || !month.equals(previousMonth) ){
						if (isgenerateMonthlyBill){
							System.out.println("********************** Bill for "+ month +"******************************");
						}
						previousMonth = month;
					}
					item.printOrder();
				}
			}
		}
		System.out.print("\n\n\n");
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}
	
}
