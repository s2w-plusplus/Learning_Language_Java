package q01;
/*
1. Write a java program to print first 10 natural numbers and their sum?
*/

public class TENsome {

	public static void main(String[] args) {
		
		//Note: 0(zero) is considered a natural number 
		
		int sum = 0;
		for (int i = 0; i <= 9; i++) 
			{
			 System.out.println(i);
			 sum+=i;
			}


		System.out.println("The sum is " + sum);
	}

}
