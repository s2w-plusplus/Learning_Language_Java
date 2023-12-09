package q14;
/*
14. Write a Java program that takes a year from user and print whether that year is a leap year or not.

Hint : a leap year is divisible by 4 and (not div by 100 or  if div by both 100 &400)
*/

import java.util.Scanner;
 class isLeap{
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the valid year: ");
	int yr=scan.nextInt();
	
	if(  (((yr%4)==0)&&((yr%100)!=0)) || (((yr%100)==0)&&(yr%400)==0) )
		{
		System.out.println("The year is a leap year");	
		}
	else System.out.println("The year is not a leap year");
	
	}
	 
	 
 }