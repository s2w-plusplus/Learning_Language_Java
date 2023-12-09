package Q2.tester;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import Q2.com.app.core.Book;
import Q2.custom_exception.Book_Xhandle;
import static Q2.utils.MapUtils.*;
import static Q2.utils.BookUtils.*;
import static Q2.com.app.core.Book.*;

public class TestBookMap 
{

	public static void main(String[] args) 
	{

		try(Scanner scan=new Scanner(System.in);) 
		{
		
			HashMap<String,Book> library=new HashMap<>(prefillMap());
			boolean Exit=false;
			System.out.println("-------Library Management System----------");
			while(!Exit) 
			{
				System.out.println("1.Add books");
				System.out.println("2.Display books");
				System.out.println("3.Issue out a book");
				System.out.println("4.Return a book");
				System.out.println("5.Remove a book");
				System.out.println("6.Reduce books before specific Date.");
				System.out.println("7.Display books of specific category");
				System.out.println("8.Sort & display books as per title");
				System.out.println("9.Sort & display books as per author and price");
				System.out.println("10.Exit Library");
				try
				{
					switch(Integer.parseInt(scan.nextLine())) 
					{
						case 1: 
								System.out.println("Enter the title of the book to be added...");
								String addname=scan.nextLine();
								addBooks(addname,library,scan);
								break;
						case 2: 
								System.out.println("Displaying all the books in the library");
								System.out.println("-----------------------------------------------------------");
								for(Book b:library.values())
									System.out.println(b);
								System.out.println("-----------------------------------------------------------");
								break;
						case 3: 
								System.out.println("Enter the book-title which you want to be issued...");
								String bname=scan.nextLine();
								Book ibook=doesBookExist(bname,library);
								if(ibook!=null) {
									if(ibook.getQuantity()!=0) {
										ibook.setQuantity(ibook.getQuantity()-1);
										System.out.println("The book has been issued");
									}	
									else System.out.println("All the books of this particular title has been issued out.Try again later!");
								}
								else System.out.println("No such book Found!");
								break;
						case 4: 
								System.out.println("Enter the book-title which you want to return...");
								Book rbook=doesBookExist(scan.nextLine(),library);
								if(rbook!=null) { 
									rbook.setQuantity(rbook.getQuantity()+1);
									System.out.println("The book has been returned");
								}	
								else System.out.println("No such book was ever issued!");
								break;
						case 5: 
								System.out.println("Enter the book-title which you want to remove...");
								Book rmbook=doesBookExist(scan.nextLine(),library);
								if(rmbook!=null) {
									library.remove(rmbook.getTitle());
									System.out.println("The book has been removed");
								}
								else System.out.println("Can't remove book that doesn't exist!");
								break;
						case 6: 
								System.out.println("Enter the upper threshold of Publish-date for the books to be reduced!");
								reduceBooks(sdf.parse(scan.nextLine()),library);
								break;
						case 7: 
								System.out.println("Enter the category of books to be displayed!");
								catDisplay(scan.nextLine(),library);
								break;
						case 8: 
								System.out.println("Sorting as per Book titles....");
								SortedMap<String,Book> bookTM=new TreeMap<>(library);
								System.out.println("-----------------------------------------------------------");
								bookTM.forEach((K,V) -> System.out.println(V));
								System.out.println("-----------------------------------------------------------");
								break;
						case 9: 
								System.out.println("Sorting as per book authors and price....");
								List<Book> vlist=new ArrayList<Book>(library.values());
								//using lambda expression	
								Collections.sort(vlist,(b1,b2) -> {
										int test=b1.getAuthorName().compareTo(b2.getAuthorName());
										if(test==0)
											return ((Double)b1.getPrice()).compareTo(b2.getPrice());	
										return test;
								});
								
								//using anonymous class	
							    /*
							      Collections.sort(vlist,new Comparator<Book>(){
									
									@Override
									public int compare(Book b1,Book b2) {
										int test=b1.getAuthorName().compareTo(b2.getAuthorName());
										if(test==0)
											return ((Double)b1.getPrice()).compareTo(b2.getPrice());	
										return test;	
									}
							
								});
							    */
							    System.out.println("Sorting Successful");
							    for(Book b:vlist)
							    	System.out.println("Title:"+b.getTitle()+", Author:"+b.getAuthorName()+", Price:"+b.getPrice());
								break;
						default:
								System.out.println("Invalid Choice!");
					}
				}catch(Book_Xhandle c){
					System.out.println(c);
				}catch (ParseException p){
					System.out.println(p);
				}catch(Exception e){
					e.printStackTrace();
				}
			scan.nextLine();
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
