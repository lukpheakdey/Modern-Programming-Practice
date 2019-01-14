package ExtraCredit;

import java.text.SimpleDateFormat;
import java.util.*;

public class Order {
	//association
	private ICustomer customer;
	
	public void setCustomer(ICustomer customer){
	   this.customer=customer;	
	}
		
	private ArrayList<Orderline> orderlines;
	
	public void addOrderline(Orderline orderline){
		orderlines.add(orderline);
	}
		
	//attributes
	private String ordernumber;
	private Date orderdate;
	private boolean prepaid;
	private double orderprice;
	private String status;
		
	public Order(String ordernumber,Date orderdate) {
		this.ordernumber=ordernumber;
		this.orderdate=orderdate;
		orderlines = new ArrayList<Orderline>();
	}
	
	public String getStatus() {
		if (status== null || status.isEmpty()){
			return "ON SHIPMENT";
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean getPrepaid(){
		return prepaid;
	}
		
	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
		
	public double getTotalPrice(){
		orderprice = 0;
		for (Orderline ol : orderlines){
			orderprice= orderprice + ol.computePrice();
		}
		return orderprice - discount;
	}
	
	public double getCustomerPoint(){
		ACustomer customerpt = (ACustomer)customer;
		return customerpt.getPoints();
	}
		
	private double discount ;

	public void setCustomerPoint(double orderPoint){
		ACustomer customerpt = (ACustomer)customer;
		if ( (customerpt.getPoints()+ orderPoint) >= 25){
			discount = orderprice * 0.40;
			customerpt.setPoints(0);
		}
		else{
			discount = 0;
			customerpt.setPoints(customerpt.getPoints() + orderPoint );
		}
	}

	private double orderPoint;
	public double getOrderPoint(){
		orderPoint = 0;
		for (Orderline ol : orderlines){
			orderPoint= orderPoint + ol.computePoints();
		}
		return orderPoint;
	}
		
	public void printOrder(){
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("OR#: "+ this.ordernumber + "\t\t\t\tDATE:" + format.format(orderdate));
		StringBuilder sb = new StringBuilder();
		for (Orderline  item : orderlines){
			sb.append(item.getOrderLineItem());
		}
			
		System.out.println("STATUS: "+this.getStatus());
		if (this.getStatus() != "PENDING SHIPMENT"){
			// Set Shipping date 
			Date date = getOrderdate();
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);
			cal.add(Calendar.DATE, 1);
			System.out.println("SHIPPING DATE : "+ format.format(cal.getTime()) );
			for (Orderline  item : orderlines){
				item.setShipdate(cal.getTime());
			}
		}
			
		if ( customer.getCreditRating() == CreditRating.poor) 
		    setPrepaid(true);
	    else
			setPrepaid(false);
			
		if (customer instanceof CorporateCust){
			CorporateCust corpcust = (CorporateCust)customer;
			if (corpcust.getCreditlimit() < getTotalPrice() ){
				setPrepaid(true);
			}
			else{
				setPrepaid(false);
			}
		}
		if (getPrepaid()){
			System.out.println("PAYMENT : PREPAID\n");
		}
		else{
			System.out.println("PAYMENT : POSTPAID\n");
		}
		System.out.println("QTY \tPrd#\tDescription \t\tPrice\t");
		System.out.println(sb);
		
		ACustomer customerpt = (ACustomer)customer;
			
		System.out.printf("CUSTOMER POINTS:\t\t\t\t%.0f pts\n" ,  customerpt.getPoints());
		System.out.printf("ORDER POINTS:\t\t\t\t\t%.0f pts\n" ,  getOrderPoint());
		System.out.printf("TOTAL POINTS:...................................%.0f pts\n" ,  customerpt.getPoints() + getOrderPoint());
		
		System.out.printf("\nGROSS TOTAL:\t\t\t\t\t$ %,.2f\n" ,  getTotalPrice() );
		setCustomerPoint(orderPoint);
		System.out.printf("DISCOUNT:\t\t\t\t\t$ %,.2f\n" ,  discount);
		System.out.printf("NET TOTAL:......................................$ %,.2f\n" ,  getTotalPrice() );
			
		if (discount!=0){
			System.out.println("\n**Total points is reseted for the discount**");
		}
		System.out.println("--------------------------------------------------------------------");
	}
	public Date getOrderdate() {
		return orderdate;
	}
}
