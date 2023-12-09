package q08;
/*
8. Write a program to find the largest of two numbers?
*/

import java.util.Scanner;
class Large3
{
		public static void main(String args[])
		{
		 Scanner scan=new Scanner(System.in);
			
		 System.out.println("Enter The First Number: ");
		 int num1=scan.nextInt();
		 System.out.println("Enter The Second Number: ");
		 int num2=scan.nextInt();
		 
		
		if(num1>num2 )System.out.println(num1+" is the largest number");		
		else if(num2>num1 ) System.out.println(num2+" is the largest number");
		else System.out.println("The numbers are same...");	
		}
}