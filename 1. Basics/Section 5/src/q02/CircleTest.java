package q02;
/*
2. Create a class Circle, it will have only one constructor which accepts radius as an argument. Write two methods in the class - calcuateArea(), calculatePerimeter(). 
Write test class to test method calls.
  
*/

import java.util.Scanner;
public class CircleTest{
   public static void main(String args[]){
	  Scanner scan  = new Scanner(System.in);
	  System.out.println("Enter radius");
	  double rad = scan.nextDouble();
	  
	  Circle c = new Circle(rad);
	  System.out.println("Area= "+c.calArea());
	  System.out.println("Perimeter= "+ c.calPerimeter());
   }
}