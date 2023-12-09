package q06;
/*
6. Write a java program to read age of a person, check if he/she is eligible to cast vote or not?
*/

import java.util.Scanner;
class Vote
{
		public static void main(String args[])
		{
		 Scanner scan=new Scanner(System.in);
			
		 System.out.println("Enter the age of a person: ");
		 int age=scan.nextInt();
		
		if(age>17) System.out.println("This person is eligible to vote..");
		else System.out.println("This person is not eligible to vote..");
		}
	
	
}