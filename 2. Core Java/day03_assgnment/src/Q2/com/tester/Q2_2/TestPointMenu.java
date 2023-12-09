package Q2.com.tester.Q2_2;
import java.util.Scanner;

import Q2.com.geometry.Point2D;
public class TestPointMenu 
{

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many points can the graph accomodate in total?");
		Point2D[] points=new Point2D[scan.nextInt()];
		
		boolean exit=false;
		while(!exit) 
		{
			System.out.println("Choose the task to be performed..");
			System.out.println("1.Plot New Point.");
			System.out.println("2.Display all Plotted Points.");
			System.out.println("3.Test Equality of 2 Points");
			System.out.println("4.Calculate distance between 2 points");
			
			switch(scan.nextInt()) 
			{
			case 1:
						System.out.println("Please Enter the details in the following format: ");
						System.out.println("<Index> <X-coordinate> <Y-coordinate>");
						int index=scan.nextInt();
					
						 if(index >= 0 && index < points.length && points[index] == null)
						     points[index]=new Point2D(scan.nextInt(),scan.nextInt());
						 else
						     System.out.println("The Index that you provided is either out of bounds or is already taken.");
						
						break;
			case 2:
						int pcount=0;
						for(Point2D P : points) 
						{
							if(P!=null) 
								{
								System.out.println("Point"+(++pcount)+": "+P.getDetails());	
								}
							else
								continue;
						}
						break;
			case 3:
						System.out.println("Enter the the indices of the points you want to test for equality");
						int i=scan.nextInt();
						int j=scan.nextInt();
						if(i >= 0 && i<points.length && j>=0 && j<points.length && points[i]!=null && points[j]!=null) 
							{
								if( (points[i].getXco()==points[j].getXco()) && (points[i].getYco()==points[j].getYco() ) )
									System.out.println("SAME");
								else
									System.out.println("DIFFERENT");
							}
						else
							System.out.println("You have either entered out-of-bounds index(es) or the points may not be assigned to these indices");
						break;
			case 4:
						System.out.println("Enter the the indices of the points you want to find the distance between");
						i=scan.nextInt();
						j=scan.nextInt();
						if(  i>=0 && i<points.length && j>=0 && j<points.length && points[i]!=null && points[j]!=null) 
							{
							 System.out.println("The distance between these points is "+points[i].calculateDistance(points[j])+" units.");
							}
						else
								System.out.println("You have either entered out-of-bounds index(es) or the points may not be assigned to these indices");
						break;
			case 10:
						exit=true;
						break;
			default:
						System.out.println("Invalid choice!Try Again..");
			}
		
		}	
		scan.close();
	}
	
}
