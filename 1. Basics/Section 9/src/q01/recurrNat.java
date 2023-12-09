package q01;
/*
1. Write a java program to print first 10 natural number using recursion?
*/

public class recurrNat 
{

	public static void main(String[] args) 
	{	
    System.out.print(recurr(10, 1));
	}

	static int recurr(int num, int n) 
	{
	 int x;
		if (num < n) 
		{
			return num;
		} 
		else
			x=recurr(num-1,1);
			System.out.print(x+" ");
		    return (x+1);
	}

}
