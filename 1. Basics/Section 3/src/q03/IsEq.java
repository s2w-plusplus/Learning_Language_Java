package q03;
/*
3. Write a java program to accept two integers and check whether they are equal or not?
>> Enter two integers : 15 15
 first and second number are equal.
*/

import java.util.Scanner;
 class IsEq
 {
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 2 numbers to be Compared:");
	System.out.print("Give A: ");                               
	int A=scan.nextInt();
	System.out.print("Give B: ");                               
	int B=scan.nextInt();
	
	if(A==B) System.out.println("A is equal to B");
	else System.out.println("A is not equal to B");

	}
 }	 

 

 
