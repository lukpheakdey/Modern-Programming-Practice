package ExtraCredit;

public class CorporateCust extends ACustomer{
	
	private CreditRating creditRating;
	private double creditlimit;

	public CorporateCust(String name, String address, String phone) {
		super(name, address, phone);
		creditlimit = 5000;
	}
	
	@Override
	public CreditRating getCreditRating() {
		return creditRating;
	}
	
	public void setCreditRating(CreditRating creditRating) {
		this.creditRating = creditRating;
	}

	public double getCreditlimit() {
		return creditlimit;
	}
	
	public void generateMonthlyBill(){
		setisgenerateMonthlyBill(true);
		printOrders();
	}
}
