package q11;
/*
11. Write a program to check whether a given number is a perfect number or not?

Note : 
Defintion of Perfect Number : sum of all divisor of the number is equal to the number itself. 
eg.  Number = 6 is perfrect because
     All positive divisor = 1 2 3, their sum=6  
*/	 


import java.util.Scanner;

public class perfectNum 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int divsum=0;
		
		for(int i = 1 ; i < num ; i++)   
		{   
		 if(num % i == 0)  divsum = divsum + i ;   
		}    

		
		if(divsum==num)
		{
			System.out.println("Its a perfect number");
		}
		else
		{
			System.out.println("Its not a perfect number");
		}
	}

}
