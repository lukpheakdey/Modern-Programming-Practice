package May2017_Pheakdey_Sol_prob2;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((authorFirstName == null) ? 0 : authorFirstName.hashCode());
		result = prime * result + ((authorLastName == null) ? 0 : authorLastName.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		if (authorFirstName == null) {
//			if (other.authorFirstName != null)
//				return false;
//		} else if (!authorFirstName.equals(other.authorFirstName))
//			return false;
//		if (authorLastName == null) {
//			if (other.authorLastName != null)
//				return false;
//		} else if (!authorLastName.equals(other.authorLastName))
//			return false;
//		if (isbn == null) {
//			if (other.isbn != null)
//				return false;
//		} else if (!isbn.equals(other.isbn))
//			return false;
//		if (title == null) {
//			if (other.title != null)
//				return false;
//		} else if (!title.equals(other.title))
//			return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass()!=this.getClass())
			return false;
		
		String isbn = ((Book)obj).getIsbn();
		if(this.isbn.equals(isbn));
		return false;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	
	
}
