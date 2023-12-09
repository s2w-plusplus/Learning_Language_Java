package q05;
/*	
5. Write a Java program to print the area and perimeter of a rectangle. Take required input using Scanner?

Hint : 
Area = width * height
Perimeter = 2 * ( width + height)
*/

import java.util.Scanner;
class Rect{
	
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Let's Calculate Area & Perimeter of a rectangle ..");
	System.out.println("Enter Width & Height of the rectangle:");
	double Wdth=scan.nextDouble();
	double Hgth=scan.nextDouble();
	System.out.println("Area of the rectangle is: "+ (Wdth*Hgth));
	System.out.println("Perimeter of the rectangle is: "+ (2*(Wdth+Hgth)) );
	}
}