package Q2.utils;

import java.text.ParseException;
import java.util.HashMap;
import static Q2.utils.BookUtils.*;

import Q2.com.app.core.Book;
import Q2.custom_exception.Book_Xhandle;
import static Q2.com.app.core.Book.sdf;


public class MapUtils {
	
	public static HashMap<String,Book> prefillMap() throws ParseException,Book_Xhandle {
	
		HashMap<String,Book> library=new HashMap<>();
		
		library.put("In Search of Lost Time",new Book("In Search of Lost Time",convert2Enum("FICTION"),260.33,sdf.parse("1-1-1913") ,"Marcel Proust",13));
		library.put("Sapiens: A Brief History of Humankind",new Book("Sapiens: A Brief History of Humankind",convert2Enum("NON_FICTION"),580.90,sdf.parse("1-1-2011") ,"Yuval Noah Harari",25));
		library.put("Anna Karenina",new Book("Anna Karenina",convert2Enum("LITERATURE"),780.13,sdf.parse("1--1-1877") ,"Leo Tolstoy",32));
		library.put("How to Win Friends and Influence People",new Book("How to Win Friends and Influence People",convert2Enum("SELF_HELP"),200,sdf.parse("1-10-1936") ,"Dale Carnegie",40));
		library.put("Watchmen",new Book("Watchmen",convert2Enum("COMICS"),645.23,sdf.parse("1-9-1986") ,"Alan Moore",7));
		library.put("The Great Gatsby",new Book("The Great Gatsby",convert2Enum("FICTION"),795.23,sdf.parse("10-4-1925") ,"F Scott Fitzgerald",17));
		library.put("The Lord of the Rings",new Book("The Lord of the Rings",convert2Enum("LITERATURE"),1045.73,sdf.parse("29-7-1954") ,"J. R. R. Tolkien",23));
		library.put("The Sixth Extinction: An Unnatural History",new Book("The Sixth Extinction: An Unnatural History",convert2Enum("NON_FICTION"),545.93,sdf.parse("11-2-2014") ,"Elizabeth Kolbert",70));
		library.put("Pride and Prejudice",new Book("Pride and Prejudice",convert2Enum("LITERATURE"),545.93,sdf.parse("28-1-1813") ,"Jane Austen",70));
		library.put("Persuasion",new Book("Persuasion",convert2Enum("LITERATURE"),145.93,sdf.parse("1-1-1818") ,"Jane Austen",70));
		library.put("Mansfield Park",new Book("Mansfield Park",convert2Enum("LITERATURE"),705.93,sdf.parse("1-1-1814") ,"Jane Austen",70));
		library.put("To Have and Have Not",new Book("To Have and Have Not",convert2Enum("FICTION"),1145.93,sdf.parse("1-1-1937") ,"Ernest Hemingway",90));
		library.put("A Farewell to Arms",new Book("A Farewell to Arms",convert2Enum("NON_FICTION"),155.93,sdf.parse("1-1-1929") ,"Ernest Hemingway",90));
		library.put("The Sun Also Rises",new Book("The Sun Also Rises",convert2Enum("FICTION"),1545.93,sdf.parse("22-10-1926") ,"Ernest Hemingway",90));
		library.put("How to Stop Worrying and Start Living",new Book("How to Stop Worrying and Start Living",convert2Enum("SELF_HELP"),215.93,sdf.parse("1-1-1948") ,"Dale Carnegie",20));
		library.put("The 7 Habits of Highly Effective People",new Book("The 7 Habits of Highly Effective People",convert2Enum("SELF_HELP"),426.33,sdf.parse("15-8-1989") ,"Stephen Covey",90));
		library.put("First Things First",new Book("First Things First",convert2Enum("SELF_HELP"),665.93,sdf.parse("1-1-1994") ,"Stephen Covey",40));
		return library;
		
	}
}
	
	
	
	

