/*
1. Write a java class named as NumUtil with following static methods: 
	double getPower(double x, int n)
 	long getFactorial(int num);
 	boolean isPrime(int num);
 	boolean isEven(int num);
 	boolean isOdd(int num);
 	
 1.1) Write test class named as NumUtilMain to test all these methods.
 1.2) Extends question 2.1 to make it menu driven, based on the user choice , read relevant data from user and call static methods
*/

package q01;

import java.util.Scanner;
public class NumUtilMain 
{
	public static void main(String args[]) 
	{
		
	Scanner sc = new Scanner(System.in);
	int choice;

	do {
		System.out.println("\nEnter the choice of operation to be performed");
		System.out.println("1. Power Operation");
		System.out.println("2. Factorial Operation");
		System.out.println("3. Check if prime or not");
		System.out.println("4. Check if even or not");
		System.out.println("5. Check if odd or not");
		System.out.println("6. To exit");

		choice = sc.nextInt();
		switch (choice) 
			{

			case 1:
				System.out.println("Enter the Number and its Exponent in that order");
				double x = sc.nextDouble();
				int num1 = sc.nextInt();
				double ans1 = NumUtil.getPower(x, num1);
				System.out.println("Powered number is "+ ans1);
				break;

			case 2:
				System.out.println("Enter number to find Factorial of");
				int num2 = sc.nextInt();
				long fact = NumUtil.getFactorial(num2);
				System.out.println("Factorial of given number is " + fact);
				break;

			case 3:
				System.out.println("Enter number to be checked of being prime");
				int num3 = sc.nextInt();
				boolean flag1 = NumUtil.isPrime(num3);
				if (flag1 == true)
					System.out.println("The number is prime");
				else
					System.out.println("The number is not prime");
				break;

			case 4:
				System.out.println("Enter number to checked of being even");
				int n4 = sc.nextInt();
				boolean flag2 = NumUtil.isEven(n4);
				if (flag2 == true)
					System.out.println("The number is even");
				else
					System.out.println("The number is not even");
				break;

			case 5:
				System.out.println("Enter number to checked of being odd");
				int n5 = sc.nextInt();
				boolean flag3 = NumUtil.isOdd(n5);
				if (flag3 == true)
					System.out.println("Entered number is odd");
				else
					System.out.println("Entered number is not odd");
				break;

			case 6:
				break;

			default:
				System.out.println("Please enter valid choice");
			}

		} while (choice != 6);

	}

}
