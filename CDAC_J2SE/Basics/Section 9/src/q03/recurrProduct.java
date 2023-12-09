package q03;
/*
3. Write a program to calculate the product of two integers using recursion? (Multiplication & Division operators are not allowed)
*/

import java.util.Scanner;

public class recurrProduct 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Multiplicand");
		int a = sc.nextInt();
		System.out.println("Enter the Multiplier");
		int b = sc.nextInt();

		System.out.println("The product of "+a+" and "+b+" is: "+recurrPro(a,b));

	}

	static int recurrPro(int n1,int n2) 
	{
		if (n2 == 1) 
			return (n1);
	    else
			return (n1+recurrPro(n1,(n2-1)));
	}

}
