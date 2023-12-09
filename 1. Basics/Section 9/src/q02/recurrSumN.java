package q02;
/*
2. Write a java program to calculate the sum of numbers from 1 to N using recursion?
*/

import java.util.Scanner;

public class recurrSumN 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to add");
		int N = sc.nextInt();

		System.out.println("The sum of "+N+" natural numbers is: "+recurrSum(N) );

	}

	static int recurrSum(int n) 
	{
		if (n == 1) 
			return (1);
	    else
			return (n+recurrSum(n-1));
	}

}
