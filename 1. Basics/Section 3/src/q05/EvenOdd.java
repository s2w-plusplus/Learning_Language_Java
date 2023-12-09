package q05;
/*
5. Write a java program to check whether a given number is even or odd?
*/

import java.util.Scanner;
class EvenOdd
{
		public static void main(String args[])
		{
		 Scanner scan=new Scanner(System.in);
			
		 System.out.println("Enter The Number: ");
		 int num=scan.nextInt();
		
		if(num%2==0) System.out.println("The Number is even.");
		else System.out.println("The Number is odd.");
		}
	
	
}