package q01;
/*
1. Write a java program to swap two numbers stored in local variables?
*/


import java.util.Scanner;
 class Swap
 {
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 2 numbers to be swapped:");
	System.out.print("Give A: ");                               
	int A=scan.nextInt();
	System.out.print("Give B: ");                               
	int B=scan.nextInt();

    int temp=A;
	A=B;
	B=temp;	
	System.out.println("The numbers after swapping are:");
	
	
	System.out.println("A="+A+" ,  B="+B);

	}
 }	 

 
