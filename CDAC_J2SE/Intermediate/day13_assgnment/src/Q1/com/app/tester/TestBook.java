package Q1.com.app.tester;

import java.text.SimpleDateFormat;
import java.util.HashSet;

import Q1.com.app.core.Book;

public class TestBook {

	public static void main(String[] args) {
	
		try {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		HashSet<Book> library=new HashSet<>();
		
		library.add(new Book("In Search of Lost Time","FICTION",260.33,sdf.parse("1-1-1913") ,"Marcel Proust",13));
		library.add(new Book("Sapiens: A Brief History of Humankind","NON_FICTION",580.90,sdf.parse("1-1-2011") ,"Yuval Noah Harari",25));
		library.add(new Book("Anna Karenina","LITERATURE",780.13,sdf.parse("1--1-1877") ,"Leo Tolstoy",32));
		library.add(new Book("How to Win Friends and Influence People","SELF_HELP",200,sdf.parse("1-10-1936") ,"Dale Carnegie",40));
		library.add(new Book("Watchmen","COMICS",645.23,sdf.parse("1-9-1986") ,"Alan Moore",7));
		
		library.add(new Book("Watchmen","COMICS",645.23,sdf.parse("1-9-1986") ,"Alan Moore",7));
		//adding duplicate will fail
		
		System.out.println(library);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	
	
	
	}

}
