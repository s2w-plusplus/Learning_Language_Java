package q13;
/*
13. Write a program to determine whether a given number is prime or not?
*/

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int c = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 2)
			System.out.println("Its a prime number");
		else
			System.out.println("Its not a prime number");

		sc.close();

	}

}
