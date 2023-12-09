package q12;
/*
12. Write a program to check whether a given number is an armstrong number or not?
*/


import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int n1 = n;
		int a = 0, b, c;

		while (n != 0) {
			b = n % 10;
			n = n / 10;
			a = a + b * b * b;
		}
		if (a == n1)
			System.out.println("The number is an Armstrong Number");
		else
			System.out.println("The number is not an Armstrong Number");

	}

}
