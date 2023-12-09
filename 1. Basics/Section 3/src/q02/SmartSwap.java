package q02;
/*
2. Write a java program to swap two numbers stored in local variables without using additional variable?
*/


import java.util.Scanner;
 class SmartSwap
 {
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 2 numbers to be swapped:");
	System.out.print("Give A: ");                               
	int A=scan.nextInt();
	System.out.print("Give B: ");                               
	int B=scan.nextInt();

    
	A=A-B;
	B=B+A;
    A=B-A;	
	System.out.println("The numbers after swapping are:");
	
	
	System.out.println("A="+A+" ,  B="+B);

	}
 }	 

 


 
