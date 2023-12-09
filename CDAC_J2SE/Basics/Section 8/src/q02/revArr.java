package q02;
/*
2. Write a program to reverse an array of elements?
*/


import java.util.Scanner;

public class revArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("How long do you want your array");
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int i;
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++)
			x[i] = sc.nextInt();

		for (i = 0; i < n; i++)
			y[i] = x[n - 1 - i];

		System.out.println("The Original Array:");
		for (i = 0; i < n; i++)
			System.out.print(x[i]);

		System.out.println("\nThe Reversed Array:");
		for (i = 0; i < n; i++)
			System.out.print(y[i]);

	}

}
