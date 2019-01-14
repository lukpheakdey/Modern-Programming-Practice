package ExtraCredit;

public class Product implements IProduct {
	//association
	private ICompPoints compPoints;

	public ICompPoints getCompPoints() {
		return compPoints;
	}
	
	private String description;
	private String productnumber;
	private double price;
	
	private boolean instock;
	public String getProductnumber() {
		return productnumber;
	}
	
	public Product(String description, String productnumber, double price, boolean instock, ICompPoints compPoints) {
		this.description= description;
		this.productnumber=productnumber;
		this.price=price;
		this.instock=instock;
		this.compPoints=compPoints;	
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public boolean isInstock() {
		return instock;
	}
}
