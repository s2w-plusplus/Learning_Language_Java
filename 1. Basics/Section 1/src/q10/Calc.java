package q10;
/*
10. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers received from command line?
*/

class Calc{
	
	public static void main(String args[]){
	
	Double x=Double.parseDouble(args[0]);
	Double y=Double.parseDouble(args[1]);
	
	System.out.println("Sum is: " + (x+y));
	System.out.println("Difference is: " + (x-y));
	System.out.println("Product is: " + (x*y) );
	System.out.println("Quotient is: " + (x/y) );
	System.out.println("Modulus is: " + (x%y));		
	}
}