package co.jsp.LMS.model;

public class Book {
	private String bookName;
	private double bookPrice;
	private String authorName;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book Name= " + bookName + "\nBookPrice= " + bookPrice + "\nAuthor Name= " + authorName;
	}
	
	
	

}
