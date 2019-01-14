package Lab5_1;

import java.time.*;

public class Order {
	
	private String orderId;
	private LocalDate orderDate;
	private double orderAmount;
	
	Order(String orderId, LocalDate orderDate, double orderAmount){
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
