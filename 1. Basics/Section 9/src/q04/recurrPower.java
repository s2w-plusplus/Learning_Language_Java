package q04;
/*
4. Write a program to calculate the power of any number using recursion?
*/

import java.util.Scanner;

public class recurrPower 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base");
		int a = sc.nextInt();
		System.out.println("Enter the Exponent");
		int b = sc.nextInt();

		System.out.println("The number "+a+" raised to power "+b+" is: "+recurrPow(a,b));

	}

	static int recurrPow(int n1,int n2) 
	{
		if (n2 == 1) 
			return (n1);
	    else
			return (n1*recurrPow(n1,(n2-1)));
	}

}
