package q09;
/*
9. Write a program to find the largest of three numbers?
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
		 System.out.println("Enter The Third Number: ");
		 int num3=scan.nextInt();
		
		if( num1>=num2 && num1>=num3 )System.out.println(num1+" is the largest number");		
		else if( num2>=num1 && num2>=num3 ) System.out.println(num2+" is the largest number");
		else System.out.println(num3+" is the largest number");	
		}
}