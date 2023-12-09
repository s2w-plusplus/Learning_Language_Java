package q01;
/*
1. Write a program to calculate average of numbers stored in an array?
*/

import java.util.Scanner;

public class arrAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to be averaged");
		int n = sc.nextInt();
		int[] a = new int[n];
		double sum = 0;
		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("The average is " + sum / n);

	}

}
