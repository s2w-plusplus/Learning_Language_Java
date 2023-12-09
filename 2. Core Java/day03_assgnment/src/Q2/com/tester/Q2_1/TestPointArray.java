package Q2.com.tester.Q2_1;
//import java.util.Arrays;
import java.util.Scanner;

import Q2.com.geometry.Point2D;

public class TestPointArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many points to plot?");
		Point2D[] points=new Point2D[sc.nextInt()];
		
		for(int i=0;i<points.length;i++)
		{
			System.out.println("Enter the Co-Ordinates of point"+(i+1));
			points[i]=new Point2D( sc.nextInt(), sc.nextInt() );
		}
		int pcount=0;
		for(Point2D P : points)
		{
			System.out.println("Point"+(++pcount)+": "+P.getDetails());			
		}
		
		sc.close();

	}

}
