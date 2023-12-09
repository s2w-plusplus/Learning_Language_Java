package Q1.com.app.core;

import java.util.Date;

public class Book {

	private String title;
	private Category bCat;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	
	public Book(String title, String bCat, double price, Date publishDate, String authorName, int quantity) {
		this.title = title;
		this.bCat = Category.valueOf(bCat);
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "\nBook [title=" + title + ", bCat=" + bCat + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("in equals");
		if(o instanceof Book) 
			return (this.title).equals( ((Book)o).title);
		return false;
	}
		
	@Override
	public int hashCode() {
		
		System.out.println("in hashCode");
		return this.title.hashCode(); 
	}

}
