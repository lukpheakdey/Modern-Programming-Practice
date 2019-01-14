package StandardExamSelfPracticePro1.May2017_prob2;

public class Book extends LendingItem {
	
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	Book(String isbn, String title, String fname, String lname){
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = fname;
		this.authorLastName = lname;
	}
}
