package Q2.utils;
import Q2.com.app.core.Book;
import Q2.com.app.core.Category;
import Q2.custom_exception.Book_Xhandle;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.text.ParseException;
import static Q2.com.app.core.Book.*;

public class BookUtils {
	
	public static Book doesBookExist(String title,HashMap<String,Book> library){
		
		Book book=library.get(title);
		if(book!=null) 
			return book;
		return null;
	}
	
	public static void addBooks(String title, HashMap<String,Book> library,Scanner scan)throws Book_Xhandle,ParseException{
		
		
		Book book=doesBookExist(title,library);
	    if(book!=null)
		{
			System.out.println("How do you want update(-reduce/+increase) the existing set?");
			int temp=book.getQuantity()+ Integer.parseInt(scan.nextLine());
			if(temp>=0) {
				book.setQuantity(temp);
				System.out.println("Number of books updated successfully.");
				}
			else
				throw new Book_Xhandle("This Updation is impossible!");
		}
		else 
			{
			System.out.println("Enter the details of the new book..");
			System.out.println("<Book_Category><Price><Publication_Date><Author_Name><Quantity>");
			library.put(title,new Book(title,convert2Enum(scan.next()),scan.nextDouble(),sdf.parse(scan.next()) ,scan.next(),scan.nextInt()));	
			System.out.println("Book Added Successfully.");
			}
	}	
	
	public static Category convert2Enum(String genre)throws Book_Xhandle  {
	 try {	
			return Category.valueOf(genre.toUpperCase());
		  }catch(IllegalArgumentException | NullPointerException e) {
				throw new Book_Xhandle("Unexpected Enum Entry");
			}
	}
	
	public static void reduceBooks(Date date,HashMap<String,Book> library) {
		
		//harder way using entrySet
		Set<Map.Entry<String,Book>> bookset=library.entrySet();
		for(Map.Entry<String,Book> bookentry:bookset)
			if(bookentry.getValue().getPublishDate().before(date))
				bookentry.getValue().setQuantity((int)(bookentry.getValue().getQuantity()*0.9));
		System.out.println("Quantity of Books reduced successfully");
	} 
		
	public static void catDisplay(String genre,HashMap<String,Book> library){
		Category btype=Category.valueOf(genre.toUpperCase());
	    Collection<Book> collbook=library.values();
	    System.out.println("--------------"+genre+"-----------------");
	    for(Book book:collbook)
			if(book.getbCat().equals(btype))
					System.out.println(book);
		System.out.println("----------------------------------------");
	}
	
			
}
	
	
	
	


