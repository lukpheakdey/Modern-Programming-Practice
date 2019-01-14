package ExtraCredit;

public enum CreditRating {
	
	poor("poor"), good("good"), excelent("excelent");
	
	private String rating;
	
	CreditRating( String rating) {
		this.rating= rating;
	}
	
	public String getSelectedCreditRating(){
		return rating;
	}
}
