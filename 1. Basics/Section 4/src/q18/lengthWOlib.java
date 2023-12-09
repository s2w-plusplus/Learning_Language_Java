package q18;
/*
18. Write a program to find the length of a string without using the library function?
*/

import java.util.Scanner;

public class lengthWOlib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		int len = 0;
		String str = sc.nextLine();

		char[] strCharArray = str.toCharArray();
		
		for (char c : strCharArray) //for each 
		{
			len++;
		}

		System.out.println("The Given String is " + len+" characters long");
		sc.close();

	}

}
