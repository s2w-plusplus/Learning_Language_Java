package q04;
/*
4. Write a program to calculate the factorial of the given number?
*/

import java.util.Scanner;

public class fact{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose Factorial is to be printed");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = n; i > 1; i--) {
			fact = fact * i;
		}

		System.out.println("The factorial is " + fact);

	}
}
