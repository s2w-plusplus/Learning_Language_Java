package q10;
/*
10. Write a program to find the smallest of five numbers?
*/

import java.util.Scanner;
class Small5
{
		public static void main(String args[])
		{
		 Scanner scan=new Scanner(System.in);
			
		 System.out.println("Enter The Five Numbers: ");
		 
		 int test,S=0;
			for(int i=0;i<5;i++) 
			{
			test=scan.nextInt();
			if(test<S) S=test;
			}
		 
		 System.out.println("Smallest of the Five Numbers is: "+ S);
		}
}