package q13;
/*
13. Write a Java program to print the ascii value of a given character?
*/

import java.util.Scanner;
 class Ascii{
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a single character: ");
	char ch=scan.next().charAt(0);
	System.out.println("The ASCII code for the given char is: "+(int)ch);
	}
	 
	 
 }