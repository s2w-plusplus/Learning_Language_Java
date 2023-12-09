package Q2.tester;

import java.util.Scanner;

import Q2.com.app.org.Emp;
import Q2.com.app.org.Mgr;
import Q2.com.app.org.Worker;

public class TestOrganisation {

	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Total number of employees needed by Organisation");
		Emp E[]=new Emp[scan.nextInt()];
		
		boolean exit=false;
		int count=0;
		while(!exit)
		{
			System.out.println("1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Display Employee Info.");
			System.out.println("4. Update PerformanceBonus or Hourly Rate");
			System.out.println("5. Stop Hiring");
			
			
			
			switch(scan.nextInt())
			{
			case 1:
						if(count<E.length)
							{
							System.out.println("Please Enter hired Manager's Info in following format");
							System.out.println("<Id><Name><BasicSalary><Department><PerformanceBonus>");
							E[count++]=new Mgr(  scan.nextInt(),scan.next(),scan.nextDouble(),scan.next(),scan.nextInt()  );
							}
						else System.out.println("No more Vacancies!");
						break;
			case 2:
						if(count<E.length)
						  {
							System.out.println("Please Enter hired Worker's Info in following format");
							System.out.println("<Id><Name><BasicSalary><Department><HoursWorked><HourlyRate>");
							E[count++]=new Worker( scan.nextInt(),scan.next(),scan.nextDouble(),scan.next(),scan.nextInt(),scan.nextInt()  );
						  }
						else System.out.println("No more Vacancies!");
						break;
			case 3:
						int fcount=0;
						if(count!=0) 
							{
							 for(Emp e: E) 
								 {
								   if(e!=null) 
								 	{
									 System.out.println( "Employee"+(++fcount)+": "+e.toString() );
									 if(e instanceof Mgr) System.out.println("This manager has performance bonus of Rs.: "+((Mgr) e).getPerformanceBonus());
									 else System.out.println("This worker has hourly rate of Rs.: "+((Worker) e).getHourlyRate());
								 	}
								 }
							 }
						else System.out.println("No one has been hired yet!");
						break;
			case 4:
						boolean found=false;
						fcount=0;
						System.out.println("Enter the Id of the employee whose Bonus/Rate has to be Updated");
						int id=scan.nextInt();
						for(Emp e: E) 
						{
						 if(e!=null && fcount<count) 
						 	{	 
							 if(id==e.getId() )
							 	{
								 found=true;
								 System.out.println("Enter the amount by which you want to incr/decr the Bonus/Rate");
								 int change=scan.nextInt();
								 if(e instanceof Mgr)  ((Mgr) e).setPerformanceBonus( ((Mgr) e).getPerformanceBonus() + (change)); 
								 else	((Worker)e).setHourlyRate( ((Worker)e).getHourlyRate() + (change)  );   
							 	}
							 else fcount++;
						 	}
						}
						if(found) System.out.println("Details Updated Successfully.");
						else System.out.println("No employee with that particular ID is found.");
						break;
			case 5:
						exit=true;
						break;
			default:
						System.out.println("The choice is invalid!");
			}
	
		}

		scan.close();
	}

}
