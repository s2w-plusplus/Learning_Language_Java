package Q2.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import static Q2.utils.BookValidation.*;

import Q2.com.app.core.Book;
import Q2.custom_exception.Book_Xhandle;

public class MapUtils {
	
	public static HashMap<String,Book> prefillMap() throws ParseException,Book_Xhandle {
	
	
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		
		HashMap<String,Book> library=new HashMap<>();
		
		library.put("In Search of Lost Time",new Book("In Search of Lost Time",convert2Enum("FICTION"),260.33,sdf.parse("1-1-1913") ,"Marcel Proust",13));
		library.put("Sapiens: A Brief History of Humankind",new Book("Sapiens: A Brief History of Humankind",convert2Enum("NON_FICTION"),580.90,sdf.parse("1-1-2011") ,"Yuval Noah Harari",25));
		library.put("Anna Karenina",new Book("Anna Karenina",convert2Enum("LITERATURE"),780.13,sdf.parse("1--1-1877") ,"Leo Tolstoy",32));
		library.put("How to Win Friends and Influence People",new Book("How to Win Friends and Influence People",convert2Enum("SELF_HELP"),200,sdf.parse("1-10-1936") ,"Dale Carnegie",40));
		library.put("Watchmen",new Book("Watchmen",convert2Enum("COMICS"),645.23,sdf.parse("1-9-1986") ,"Alan Moore",7));
				
		return library;
		
	}
}
	
	
	
	

