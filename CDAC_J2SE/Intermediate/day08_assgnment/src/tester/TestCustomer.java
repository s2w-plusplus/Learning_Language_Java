package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.core.Customer;

import custom_exception.Custom_erXHandle;

public class TestCustomer {
	
	public static void main (String[] args) 
	{
		try(Scanner scan=new Scanner(System.in)) 
		{
			System.out.println("Enter the total number of customers  to be handled");
			Customer clist[]=new Customer[scan.nextInt()];
			
			boolean Exit=false;
			int counter=-1;
			while(!Exit) 
			{
				try {
						System.out.println("Enter the appropriate choice..");
						System.out.println("1. Register a Customer");
						System.out.println("2. Display Customer Details");
						System.out.println("3. Exit");
						switch(scan.nextInt()) 
						{
						case 1: if(counter<clist.length-1) 
										{
										System.out.println("Enter the customer details in following format");
										System.out.println("<Name><Email><Password><RegistrationAmount<DOB><AccessLevel>;");
										Customer dummy=new Customer( scan.next(), checkEmail(scan.next(),clist) , checkPWD(scan.next()) 
												, checkRegAmount(scan.nextDouble()) , checkDOB(scan.next()) , checkEnum(scan.next()) );
										clist[++counter]=dummy;
										}
									else throw new Custom_erXHandle("No more Customers can be handled");
									break;
						case 2:
									if(counter<0) System.out.println("There is nothing in the list to display");
									for(Customer C:clist) 
									{
										if(C!=null)
											System.out.println(C);
										else break;
									}
									break;
						case 3:
									Exit=true;
									break;
						
						}
					
					}catch(Custom_erXHandle c) {
						System.out.println(c.getMessage());
					}catch(Exception e) {
						e.printStackTrace();
					}
				scan.nextLine();
			}
	
			
		}
	
	}

}
