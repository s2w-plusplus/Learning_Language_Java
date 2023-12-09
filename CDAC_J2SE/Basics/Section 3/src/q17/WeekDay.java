package q17;
/*
17. Write a java program to ask user to enter a number between 1 and 7, print week day as per below mappings - 
 (1 - Monday, 2-Tuesday, .... 7-Sunday)
*/

import java.util.Scanner;

public class WeekDay{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 7");
		int day = sc.nextInt();
		String wkdy[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		if(day>0 && day<8) System.out.print(wkdy[day-1]);
	    else System.out.print("Invalid Choice");
	}

}
