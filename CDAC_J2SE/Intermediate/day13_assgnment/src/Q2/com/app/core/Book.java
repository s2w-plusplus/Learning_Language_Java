package Q2.com.app.core;

import java.util.Date;

public class Book {

	private String title;
	private Category bCat;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	
	public Book(String title, Category bCat, double price, Date publishDate, String authorName, int quantity) {
		this.title = title;
		this.bCat = bCat;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [ Title:'" + title + "', Genre:'" + bCat + "', Price:'" + price + "', Published on:'" + publishDate
				+ "', Name of Author:'" + authorName + "', Quantity:'" + quantity + "']";
	}
	
	
	
	//we don't need 'equals' and 'hashCode' of 'Book' for using HashMap  
	//It will use 'equals' and 'hashCode' of "KEY", String Class in this case..
	
}
