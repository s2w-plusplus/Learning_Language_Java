package q17;
/*
17.  Write a program to check whether a given number is a Strong Number or not?
Note : If sum of factorial of each digit of a number is equal to that number, then that number is called strong number.
*/


import java.util.Scanner;

public class isStrong
{
	static int myfact(int f)
	{
		int ans=1;
		for(int i=f;i>0;i--)
			{
			ans*=i;	
			}
		return ans;	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		int numcpy=num;
		int sum=0;
		int lastdig;
        do
		{
			lastdig=numcpy%10;	
			if(lastdig==0)
				{
				sum++;
				}
			else
				{
				sum+=myfact(lastdig);		 
				}			 
			numcpy=numcpy/10;	
		
		}while(numcpy!=0);
		
		if (sum == num)
			System.out.println("Its a Strong Number");
		else
			System.out.println("Its not a Strong Number");

	}

}


	
	
	
	
	
