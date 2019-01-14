package ExtraCredit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static  ArrayList<IProduct> inventory = new ArrayList<IProduct>();
	
	public static IProduct SearchInventory(String productnumber){
	   for (IProduct item : inventory ){
		   Product product =  (Product)item;
		   if (product.getProductnumber() == productnumber){
			   return product;
		   }
	   }
	   return null;
	}

	public static void main(String[] args) throws ParseException {
		
		//Create list of products
		inventory.add(new Product("Mac Book", "0001", 1350.00, true, new ComputerPoints()));
		inventory.add(new Product("Surface Pro Laptop", "0002", 1700.00, false, new ComputerPoints()));
		inventory.add(new Product("Headset", "0003", 400.00, true, new Audio_VideoPoints()));
		inventory.add(new Product("VitC", "0004", 100.00, true, new HealthPoints()));
		inventory.add(new Product("Oil", "0005", 300.00, true, new OtherPoints()));
		
		//Generic 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		
		//Create Customer
		ACustomer corpCust = new CorporateCust("Victor Pineda", "California", "987-567-1234");
		corpCust.setCreditRating(CreditRating.excelent);
		//Create Order (orderid, date)
		Order order1 = new Order("12345-123",formatter.parse("14-11-2018"));
		order1.setCustomer(corpCust);
		Order order2 = new Order("4567-5678",formatter.parse("15-11-2018"));
		order2.setCustomer(corpCust);
		
		//Create orderline (qty, product, order)
		Orderline firstOrder = new Orderline(1, SearchInventory("0001"), order1);
		Orderline secondOrder = new Orderline(1, SearchInventory("0002"), order1);
		Orderline thirdOrder = new Orderline(1, SearchInventory("0003"), order1);
		Orderline forthOrder = new Orderline(1, SearchInventory("0004"), order1);
		Orderline fifthOrder = new Orderline(1, SearchInventory("0005"), order1);
		
		order1.addOrderline(firstOrder);
		//order1.addOrderline(secondOrder);
		order1.addOrderline(thirdOrder);
		order1.addOrderline(forthOrder);
		order1.addOrderline(fifthOrder);
		order1.addOrderline(firstOrder);
		
		firstOrder = new Orderline(5, SearchInventory("0001"), order2);
		secondOrder = new Orderline(1, SearchInventory("0002"), order2);
		thirdOrder = new Orderline(10, SearchInventory("0003"), order2);
		forthOrder = new Orderline(20, SearchInventory("0004"), order2);
		fifthOrder = new Orderline(20, SearchInventory("0005"), order2);
		
		order2.addOrderline(firstOrder);
		order2.addOrderline(secondOrder);
		order2.addOrderline(thirdOrder);
		order2.addOrderline(forthOrder);
		order2.addOrderline(fifthOrder);
		order2.addOrderline(firstOrder);
		
		//create order
		corpCust.createOrder(order1);
		corpCust.createOrder(order2);
		
		//print
		corpCust.printOrders();
		
		ACustomer PersonalCust = new PersonalCust("Pheakdey","IOWA","123-7456-7899");
		//corpCust.setCreditRating(CreditRating.poor);
		//Create Order (orderid, date)
		Order porder1 = new Order("1245-890",formatter.parse("14-11-2018"));
		porder1.setCustomer(corpCust);
		
		Order porder2 = new Order("47502-758",formatter.parse("15-11-2018"));
		porder2.setCustomer(corpCust);
		
		//Create orderline (qty, product, order)
		firstOrder = new Orderline(2, SearchInventory("0001"),porder1);
		secondOrder = new Orderline(2, SearchInventory("0002"),porder1);
		thirdOrder = new Orderline(2, SearchInventory("0003"),porder1);
		forthOrder = new Orderline(2, SearchInventory("0004"),porder1);
		fifthOrder = new Orderline(2, SearchInventory("0005"),porder1);
		
		porder1.addOrderline(firstOrder);
		porder1.addOrderline(secondOrder);
		porder1.addOrderline(thirdOrder);
		porder1.addOrderline(forthOrder);
		porder1.addOrderline(fifthOrder);
		porder1.addOrderline(firstOrder);
		
		
		firstOrder = new Orderline(2, SearchInventory("0001"), porder2);
		secondOrder = new Orderline(3, SearchInventory("0002"), porder2);
		thirdOrder = new Orderline(2, SearchInventory("0003"), porder2);
		forthOrder = new Orderline(4, SearchInventory("0004"), porder2);
		fifthOrder = new Orderline(5, SearchInventory("0005"), porder2);
		porder2.addOrderline(firstOrder);
		porder2.addOrderline(secondOrder);
		porder2.addOrderline(thirdOrder);
		porder2.addOrderline(forthOrder);
		porder2.addOrderline(fifthOrder);
		porder2.addOrderline(firstOrder);
		
		//create order
		PersonalCust.createOrder(porder1);
		PersonalCust.createOrder(porder2);
		
		//print
		PersonalCust.printOrders();
		
		//print
		CorporateCust pCorpCust  =(CorporateCust)corpCust;
		pCorpCust.generateMonthlyBill();
	}
}
