package q04;
/*
4. Write a java program to check whether a given number is positive or negative?
*/

import java.util.Scanner;
 class NegPos
 {
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Integer number: ");
	int A=scan.nextInt();
	
	if(A>0) System.out.println("The number is Positive");
	else if(A<0) System.out.println("The number is Negative");
	else System.out.println("The number is neither +ve nor -ve");
	}
 }	 

 

 


 
