package q07;
/*
7. Write a program to find the Factorial of a number using recursion?
*/

import java.util.Scanner;

public class recurrFact {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		long result = factorial(n);
		System.out.println("Result:" + result);
	}

	static long factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}