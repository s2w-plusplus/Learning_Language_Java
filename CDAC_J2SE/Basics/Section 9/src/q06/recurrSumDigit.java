package q06;
/*
6. Write a program to find the sum of digits of a number using recursion?
*/

import java.util.Scanner;

public class recurrSumDigit 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int N = sc.nextInt();
		
		System.out.println("Sum of digits of the number is:"+recurrSOD(N));
		
	}

	static int recurrSOD(int n) 
	{
		if (n == 0) 
			return (0);
	    else
			return ( (n%10)+recurrSOD(n/10) );
	}

}
