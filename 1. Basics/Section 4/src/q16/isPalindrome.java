package q16;
/*
16. Write a program to check whether a number is a palindrome or not.
Note: If reverse of a number is same as that of number , then it is called palindrome. eg. 11, 151, 121,
*/


import java.util.Scanner;

public class isPalindrome 
{

	public static void main(String[] args) 
	{

//-------------------------------------------------------------------------------------------
//==============same code as previous problem 15 (flipnum.java)==============================		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		int revnum=0;
		int lastdig = 0; 
		int numcpy=num;
		
		while (numcpy != 0) 
		{
			lastdig = numcpy % 10;
			revnum = revnum * 10 + lastdig;
			numcpy = numcpy / 10;
		}

//=============================================================================================
//========================added code=========================	


		if (num == revnum)
			System.out.println("The number is a pallindrome");
		else
			System.out.println("The number is not a pallindrome");

	}

}
