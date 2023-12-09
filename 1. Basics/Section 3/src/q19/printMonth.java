package q19;
/*
19. Write a java program to ask user to enter month number (1-12) , print month name as per below mappings - 
(1 - January, 2-Feburary ... 12- December)
*/

import java.util.Scanner;

public class printMonth{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 12");
		int mon = sc.nextInt();
		String MnthNm[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		if(mon>0 && mon<12) System.out.print(MnthNm[mon-1]);
	    else System.out.print("Invalid Choice");
	}

}
