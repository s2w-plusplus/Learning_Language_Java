package Q3;
import java.util.Scanner;
class TestPoint{

    public static void main(String args[]){
      
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the coordinates of Point1");
     Point2D point1=new Point2D(scan.nextInt(),scan.nextInt());
     System.out.println("Enter the coordinates of Point2");
     Point2D point2=new Point2D(scan.nextInt(),scan.nextInt());
      

     System.out.println("Points you entered:");  
     System.out.println(point1.getDetails()); 
     System.out.println(point2.getDetails());
     
     System.out.println("The Statement that point1 & point2 are one and the same is "+ point1.isEqual(point2) );
      
     System.out.println("Please specify the (x,y) values by which you want to offset Point1");
     Point2D offpoint=point2.createNewPoint(scan.nextInt(),scan.nextInt());
     System.out.println("The details of the newly created point 'offpoint' are: ");
     System.out.println(offpoint.getDetails());
    
     System.out.println("The distance between point2 & offpoint is: "+ offpoint.calculateDistance(point2) );
     scan.close();
  
    }
}