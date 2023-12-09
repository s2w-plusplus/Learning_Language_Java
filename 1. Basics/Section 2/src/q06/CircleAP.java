package q06;
/*
6. Write a Java program to print the area and perimeter of a circle. Take required input using Scanner?

Hint : 
Area = Math.PI * radius * radius
Perimeter = 2* Math.PI* radius
*/
import java.util.Scanner;
class CircleAP{
	
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Let's Calculate Area & Perimeter of a circle ..");
	System.out.println("Enter the radius of the circle:");
	double R=scan.nextDouble();
	System.out.println("Area of the rectangle is: "+ (Math.PI*R*R) );
	System.out.println("Perimeter of the circle is: "+ ( 2*Math.PI*R ) );
	}
}