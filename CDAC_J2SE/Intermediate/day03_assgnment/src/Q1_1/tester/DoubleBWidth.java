package Q1_1.tester;
import Q1_1.com.app.core.Box;
import java.util.Scanner;

public class DoubleBWidth {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number of boxes you want to create");
	Box[] boxes=new Box[scan.nextInt()];
	
	System.out.println("Please provide the dimensions of corresponding boxes");
	for(int i=0;i<boxes.length;i++)
	{
		System.out.println("Enter Width,Length and Heigth of the box"+ (i+1) );
		boxes[i]=new Box(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
	}
	
	System.out.println("The List of boxes with their corresponding dimensions are as follows:");
	int bcount=0;
	for(Box b : boxes) 
	{
	 System.out.println("Box"+(++bcount)+": "+b.getBoxDetails());	
	}
	
	System.out.println("Now doubling the Width of all the boxes whose volume is greater than 100....");
	for(Box b : boxes) 
	{
	 if( b.getBoxVolume()  > 100) 
	 	{
		 b.setBwidth(2*b.getBwidth());
	 	} 	
	}
	
	System.out.println("Modified Box details are as follows:");
	bcount=0;
	for(Box b : boxes) 
	{
	 System.out.println("Box"+(++bcount)+": "+b.getBoxDetails());	
	}
	
	scan.close();
	
	}

}
